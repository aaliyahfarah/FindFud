package com.bangkit.findfud.util

class WeatherRepos {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}