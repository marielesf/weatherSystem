# Fullstack Basic Challenge

This example will allow us to see your development for a simple fullstack app.

## Tasks

### 1. Create a backend to run with Gradle or Maven

You can use [Spring Initializr][SpringInitializr] to kick-start, or do directly here. The dependencies are free of choice, use those you like, know best.
After created, your service must have a URI that shows it is running, like `/health`, and other to display arbitrary application info, like `/info`
´´´
http://localhost:8080/health
´´´

### 2. Integrate OpenWeatherMap and make it operational

You will use OpenWeatherMaps to complete this service, so take a time to make your personal registration to get your API Key.
Go to [OpenWeatherMaps][OpenWeather] for this. We also recomend you to check carefully the documentation there.

Your goal is to have an endpoint `GET /weather` that accepts the parameter `city` and return weather data to that city, with details like (condition, temperature, atmospheric pressure, etc). All that through HTTP requests made to OpenWeatherMaps.
´´´
EX. Request http://localhost:8080/weather/lisboa
´´´

Other good feature to have is a call retrieving several nearby cities weather, OpenWeatherAPI provides a way of getting that by geographic coordinates: [Cities in circle][citycircle]. You can identify this other endpoint as `GET /find`.
´´´
EX. Request http://localhost:8080/find?lon=-9.1333&lat=38.7167
´´´

#### 2.1. Provide a frontend for users may have a better UI/UX, should be a simple SPA

User will say wheter city they want to check the weather, you'll use this info to call your backend endpoints and display this data back.

When the user calls `/find` endpoint, providing *lat*, *lon* and *cnt* as latitude, longitude and number of cities, you will display a list paginated results with offset 10 cities on each page. The most useful data is of your choice (temp, pressure, etc)

I use [Angular][angular]


### 3. Security

We want to limit the access to your services also using an API key to avoid unrequested calls.
So, implement Spring security strategy to use an API key you'll set and share with allowed clients.

### 4. Testing the API service

How can we test these calls?
Document, explain how to clients will connect. May you use a library to make your service self testable and well documented?

´´´
http://localhost:8080/swagger-ui.html
´´´

