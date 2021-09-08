package edu.escuelaing.arep.parcial;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

        public static void main(String[] args){
            String city = "Barcelona";
            HttpWeatherService weatherService = CurrentServiceInstance.getInstance().getService();

            weatherService.setCity(city);

            String response = "None";
            try{
                response = weatherService.TimeSeries();
            }catch(IOException e){
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE,null,e);
            }
            System.out.println(response);

        }



}
