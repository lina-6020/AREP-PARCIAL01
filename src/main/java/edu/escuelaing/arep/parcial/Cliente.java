package edu.escuelaing.arep.parcial;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    public static final Integer PORT = 35000;
    public static void main(String[] args){

        WebServer httpServer = WebServer._instance;
        try {
            httpServer.start();
        } catch (IOException | URISyntaxException e) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, e);
        }

    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return PORT;
    }



}
