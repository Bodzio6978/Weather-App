package com.gmail.bogumilmecel2.weatherapp.di

import com.gmail.bogumilmecel2.weatherapp.data.location.DefaultLocationTracker
import com.gmail.bogumilmecel2.weatherapp.data.repository.WeatherRepositoryImp
import com.gmail.bogumilmecel2.weatherapp.domain.location.LocationTracker
import com.gmail.bogumilmecel2.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImp: WeatherRepositoryImp
    ):WeatherRepository
}