package com.gmail.bogumilmecel2.weatherapp.presentation

import com.gmail.bogumilmecel2.weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading:Boolean = false,
    val error:String? = null

)