# Fullstack Basic Challenge

This example will allow us to see your development for a simple fullstack app.

There is no timeframe defined for this, take you time, relax, enjoy coding, search, learn.

So, the first recomendation is: Stay calm and do your best. The second would be: Don't be affraid and enjoy the ride.

We don't know all and we don't expect you to know. We need to get knowing you through this challenge, we supose you would like to show your best here.
We can also give you tips: [1][tip], [2][tip2], [3][tip3] and [4][tip4]

Also, there is no need to do all tasks, we want to assess your ability to develop, test, solve problems and be pro-active, beyond just code.

## Tasks

### 1. Create a backend to run with Gradle or Maven

You can use [Spring Initializr][SpringInitializr] to kick-start, or do directly here. The dependencies are free of choice, use those you like, know best.
After created, your service must have a URI that shows it is running, like `/health`, and other to display arbitrary application info, like `/info`

### 2. Integrate OpenWeatherMap and make it operational

You will use OpenWeatherMaps to complete this service, so take a time to make your personal registration to get your API Key.
Go to [OpenWeatherMaps][OpenWeather] for this. We also recomend you to check carefully the documentation there.

Your goal is to have an endpoint `GET /weather` that accepts the parameter `city` and return weather data to that city, with details like (condition, temperature, atmospheric pressure, etc). All that through HTTP requests made to OpenWeatherMaps.

You can organize your response as you like most. But we suggest you to use a library to treat errors and serialization/deserialization for you.

Other good feature to have is a call retrieving several nearby cities weather, OpenWeatherAPI provides a way of getting that by geographic coordinates: [Cities in circle][citycircle]. You can identify this other endpoint as `GET /find`.

Structure your outcome in a way you think more suitable... There's no stricted rule, be creative!

#### 2.1. Provide a frontend for users may have a better UI/UX, should be a simple SPA

User will say wheter city they want to check the weather, you'll use this info to call your backend endpoints and display this data back.

When the user calls `/find` endpoint, providing *lat*, *lon* and *cnt* as latitude, longitude and number of cities, you will display a list paginated results with offset 10 cities on each page. The most useful data is of your choice (temp, pressure, etc)

You can use [Angular][angular], [Vue][vue], [React][react], [Svelte][svelte]... your choice!

### 3. Security

We want to limit the access to your services also using an API key to avoid unrequested calls.
So, implement Spring security strategy to use an API key you'll set and share with allowed clients.

### 4. Testing the API service

How can we test these calls?
Document, explain how to clients will connect. May you use a library to make your service self testable and well documented?

### 5. Improvements

Any improvements you want to do on that specification is welcomed.
Know how to use caching? Do it.
Want to store locally some data to respond even when OpenWeatherMaps is offline? Store it.
Would you like to use Docker to run? Use it.

[OpenWeather]: https://openweathermap.org/appid
[SpringInitializr]: https://start.spring.io/
[SpringBoot]: https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started
[citycircle]: https://openweathermap.org/current#cycle
[tip]: https://www.baeldung.com/spring-boot-angular-web
[angular]: https://angular.io/docs
[vue]: https://vuejs.org/v2/guide/
[react]: https://reactjs.org/docs/getting-started.html
[svelte]: https://svelte.dev/
[tip2]: https://www.baeldung.com/spring-boot-react-crud
[tip3]: https://www.baeldung.com/spring-boot-h2-database
[tip4]: https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html