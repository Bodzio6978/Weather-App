package com.gmail.bogumilmecel2.weatherapp.domain.weather

data class WeatherInfo(
    val weatherDataPerDay: Map<Int,List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
