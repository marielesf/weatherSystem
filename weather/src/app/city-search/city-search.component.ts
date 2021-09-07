import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { WeatherService } from "../weather.service";

@Component({
  selector: 'app-city-search',
  templateUrl: './city-search.component.html',
  styleUrls: ['./city-search.component.css']
})
export class CitySearchComponent implements OnInit {
  public weatherSearchForm: FormGroup;
  public weatherData: any;
  constructor(private formBuilder: FormBuilder,
    private weatherService: WeatherService) {
    this.weatherSearchForm = this.formBuilder.group({
      location: ['']
    });
  }

  ngOnInit(): void {
    this.weatherSearchForm = this.formBuilder.group({
      location: ['']
    });
  }

  getTemperature(formValues: any) {
    this.weatherService
      .getWeatherbyCity(formValues.location)
      .subscribe(data => {
        this.weatherData = data;
      })
  }

}
