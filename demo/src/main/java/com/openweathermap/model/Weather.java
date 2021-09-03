package com.openweathermap.model;

import lombok.Data;

@Data
public class Weather {
    private String condition;
    private String temperature;
    private String atmospheric;
    private String pressure;
    private String nameCity;
    private double lat;
    private double lon;

    public Weather() {}

    public Weather(String condition, String temperature, String pressure, String nameCity, double lat, double lon) {
        this.condition = condition;
        this.temperature = temperature;
        this.pressure = pressure;
        this.nameCity = nameCity;
        this.lat = lat;
        this.lon = lon;
    }

}
