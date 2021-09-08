package edu.escuelaing.arep.parcial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class HttpWeatherService {
    private static final String USER_AGENT = "Mozilla/5.0";

    public String TimeSeries() throws IOException {
        String responseStr = "None";
        URL obj = new URL(getURL());
        HttpURLConnection con =(HttpURLConnection)obj.openConnection();
        con.setRequestMethod("GET");
        con.addRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("GET Response code :: "+ responseCode);

        if(responseCode==HttpURLConnection.HTTP_OK){
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while((inputLine = in.readLine())!=null){
                response.append(inputLine);
            }
            in.close();
            responseStr = response.toString();

        }else{
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");
        return responseStr;

    }

    public abstract String getURL();
    public abstract void setCity(String city);



}

