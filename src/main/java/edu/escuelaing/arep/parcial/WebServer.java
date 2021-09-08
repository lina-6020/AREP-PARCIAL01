package edu.escuelaing.arep.parcial;

import javax.activation.MimeType;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebServer {
    public static final WebServer _instance = new WebServer();
    public WebServer() {

    }
    public void start() throws IOException, URISyntaxException{
        ServerSocket serverSocket = null;
        int port =35000;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.err.println("Could not listen on port: " + port + ".");
            System.exit(1);
        }
        boolean running = true;
        while(running){
            Socket clientSocket = null;
            try {
                System.out.println("Listo para recibir ...");
                clientSocket = serverSocket.accept();
            } catch (IOException e) {
                System.err.println("Accept failed.");
                System.exit(1);
            }
            serverConnection(clientSocket);
        }
        serverSocket.close();
    }
    public void serverConnection(Socket clientSocket) throws IOException {
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        clientSocket.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            if (inputLine.startsWith("GET")){
                System.out.println("Received from the client: " + inputLine);
                manageResource(clientSocket.getOutputStream(), inputLine);
            }
            if (!in.ready()) {
                break;
            }
        }
        out.close();
        in.close();
        clientSocket.close();
    }
    public void manageResource(OutputStream out, String input){
         String city = input.split(" ")[1].replace("/", "");;
         HttpWeatherService weatherService = CurrentServiceInstance.getInstance().getService();
         weatherService.setCity(city);
         String response = "None";
         WeatherApi weatherApi=new WeatherApi();
         weatherApi.setCity(city);
         try{
            response = weatherService.TimeSeries();
         }catch(IOException e){
         Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE,null,e);
         }
         System.out.println(response);
    }
    private String default404Response() {
        String outputLine = "HTTP/1.1 200 OK\r\n" + "Content-Type: text/html\r\n" + "\r\n" + "<!DOCTYPE html>\n"
                + "<html>\n" + "	<head>\n" + "		<meta charset=\"UTF-8\">\n" + "		<title>Inicio</title>\n"
                + "	</head>\n" + "	<body>\n" + "		<h1>NOT FOUND 404</h1>\n" + "	</body>\n" + "</html>\n";
        return outputLine;
    }

}
