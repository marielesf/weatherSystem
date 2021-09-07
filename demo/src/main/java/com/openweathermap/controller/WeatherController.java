package com.openweathermap.controller;

import com.openweathermap.model.Weather;
import com.openweathermap.model.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/health")
    public String health(){
        return "UP";
    }

    @CrossOrigin
    @GetMapping(value = "weather/{city}")
    public ResponseEntity getWeather(@RequestHeader("API-Token") String token, @PathVariable("city") String city) {
        if(token.equals("security-Token"))
            return ResponseEntity.ok(weatherService.getWeatherConditions(city));
        else
            return ResponseEntity.status(401).body("Token invalid");
    }

    @CrossOrigin
    @GetMapping(value = "/find")
    public List<Weather> findCities(@RequestParam("lon") double lon, @RequestParam("lat") double lat,  @RequestParam("qtdCities") int qtdCities) {
        return weatherService.getCitiesCircle(lat, lon, qtdCities);
    }
}
