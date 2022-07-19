package com.gmail.bogumilmecel2.weatherapp.domain.repository

import com.gmail.bogumilmecel2.weatherapp.domain.util.Resource
import com.gmail.bogumilmecel2.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(latitude:Double, longitude:Double):Resource<WeatherInfo>
}