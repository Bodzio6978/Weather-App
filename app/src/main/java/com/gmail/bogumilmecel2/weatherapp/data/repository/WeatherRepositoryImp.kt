package com.gmail.bogumilmecel2.weatherapp.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.gmail.bogumilmecel2.weatherapp.data.mappers.toWeatherInfo
import com.gmail.bogumilmecel2.weatherapp.data.remote.WeatherApi
import com.gmail.bogumilmecel2.weatherapp.domain.repository.WeatherRepository
import com.gmail.bogumilmecel2.weatherapp.domain.util.Resource
import com.gmail.bogumilmecel2.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImp @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {

    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(
        latitude: Double,
        longitude: Double
    ): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    latitude = latitude,
                    longitude = longitude
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}