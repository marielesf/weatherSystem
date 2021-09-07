import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { allAppRoutes } from './routes';
import { WeatherComponent } from './weather/weather.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CoordenatesSearchComponent } from './coordenates-search/coordenates-search.component';
import { CitySearchComponent } from './city-search/city-search.component';
import { NgxPaginationModule } from 'ngx-pagination';
import { PaginationControlComponent } from './pagination-control/pagination-control.component';


@NgModule({
  declarations: [
    AppComponent,
    WeatherComponent,
    CoordenatesSearchComponent,
    CitySearchComponent,
    PaginationControlComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(allAppRoutes),
    ReactiveFormsModule,
    HttpClientModule,
    NgxPaginationModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
