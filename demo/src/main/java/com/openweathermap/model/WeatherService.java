package com.openweathermap.model;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class WeatherService {

    @Value("${key}")
    private String apiKey;

    private RestTemplate rest = new RestTemplate();

    public Weather getWeatherConditions(String city){
        String uri = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=" + apiKey;
        JsonNode weatherJson = rest.getForObject(uri, JsonNode.class);
        Weather weather = new Weather(weatherJson.get("weather").get(0).get("description").asText(),
                weatherJson.get("main").get("temp").asText(),
                weatherJson.get("main").get("pressure").asText(),
                weatherJson.get("name").asText(),
                weatherJson.get("coord").get("lat").asDouble(),
                weatherJson.get("coord").get("lon").asDouble());
        weather.setAtmospheric(weatherJson.get("visibility").asText());
        return weather;
    }

    public List<Weather> getCitiesCircle(double lat, double lon){
        List<Weather> list = new ArrayList<>();
        String uri = "http://api.openweathermap.org/data/2.5/find?lat="+lat+"&lon="+lon+"&appid=" + apiKey;
        JsonNode weatherJson = rest.getForObject(uri, JsonNode.class);
        Iterator ite = weatherJson.get("list").iterator();
        while (ite.hasNext()){
            JsonNode node = (JsonNode) ite.next();
            Weather weather = new Weather(node.get("weather").get(0).get("description").asText(),
                    node.get("main").get("temp").asText(),
                    node.get("main").get("pressure").asText(),
                    node.get("name").asText(),
                    node.get("coord").get("lat").asDouble(),
                    node.get("coord").get("lon").asDouble());
            list.add(weather);
        }
        return list;
    }
}
