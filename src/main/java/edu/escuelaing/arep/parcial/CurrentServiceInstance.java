package edu.escuelaing.arep.parcial;

public class CurrentServiceInstance {
    private static CurrentServiceInstance _instance = new CurrentServiceInstance();
    private HttpWeatherService service;

    private CurrentServiceInstance(){
        service = new WeatherApi();
    }

    public static CurrentServiceInstance getInstance(){
        return _instance;
    }

    public HttpWeatherService getService(){
        return service;
    }

    public void setService(HttpWeatherService service){
        this.service = service;
    }
}
