package com.gmail.bogumilmecel2.weatherapp.di

import com.gmail.bogumilmecel2.weatherapp.data.location.DefaultLocationTracker
import com.gmail.bogumilmecel2.weatherapp.domain.location.LocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {

    @Binds
    @Singleton
    abstract fun bindLocationTracker(
        defaultLocationTracker: DefaultLocationTracker
    ):LocationTracker
}