import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class WeatherService {

  constructor(private http: HttpClient) { }

  getWeatherbyCity(location: string) {
    return this.http.get(
      'http://localhost:8080/weather/' + location, {headers:{"API-Token":"security-Token"}}
    );
  }

  getWeatherByCoordenates(lat: number,lon: number, qtdCities: number ) {
    return this.http.get(
      'http://localhost:8080/find?lat=' + lat +'&lon='+ lon+ '&qtdCities=' +qtdCities, {headers:{"API-Token":"security-Token"}}
    );
  }
}