package com.openweathermap.controller;

import com.openweathermap.model.Weather;
import com.openweathermap.model.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/health")
    public String health(){
        return "UP";
    }

    @GetMapping(value = "weather/{city}")
    public Weather getWeather(@PathVariable("city") String city) {
        return weatherService.getWeatherConditions(city);
    }

    @GetMapping(value = "/find")
    public List<Weather> findCities(@RequestParam("lon") double lon, @RequestParam("lat") double lat) {
        return weatherService.getCitiesCircle(lat, lon);
    }
}
