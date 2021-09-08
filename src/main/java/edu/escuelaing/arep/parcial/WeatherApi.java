package edu.escuelaing.arep.parcial;

public class WeatherApi extends HttpWeatherService{

    String city = "Barcelona";
    String URL = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=34471f529b75e07d7310ceaf920b8014";
    @Override
    public String getURL() {
        System.out.println(URL);
        return URL;

    }

    @Override
    public void setCity(String city) {
        city = city.replace("\"", "");
        this.city = city;
        System.out.println(city);
        URL =  "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=34471f529b75e07d7310ceaf920b8014";
    }

}
