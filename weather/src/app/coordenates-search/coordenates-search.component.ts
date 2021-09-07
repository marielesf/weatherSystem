import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { WeatherService } from '../weather.service';

@Component({
  selector: 'app-coordenates-search',
  templateUrl: './coordenates-search.component.html',
  styleUrls: ['./coordenates-search.component.css']
})
export class CoordenatesSearchComponent implements OnInit {
  public CoordinatesSearchForm: FormGroup;
  public weatherData: any;
  constructor(private formBuilder: FormBuilder,
    private weatherService: WeatherService) {
    this.CoordinatesSearchForm = this.formBuilder.group({
      lat: [''],
      lon: [''],
      qtdCities: 0
    });
  }

  ngOnInit(): void {
    this.CoordinatesSearchForm = this.formBuilder.group({
      lat: [''],
      lon: [''],
      qtdCities: 0
    });
  }

  getTemperature(formValues: any) {
    this.weatherService
      .getWeatherByCoordenates(formValues.lat, formValues.lon, formValues.qtdCities)
      .subscribe(data => {
        this.weatherData = data;
        console.log(this.weatherData);
      })
  }
}
