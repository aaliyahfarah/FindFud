package com.bangkit.findfud.model

import com.bangkit.findfud.R

object DummyWeather {
    val dummyWeather = listOf(
        Weather(1,"12:00", R.drawable.weather_sunny, R.string.weather_sunny, 27),
        Weather(2,"13:00", R.drawable.weather_sunny, R.string.weather_sunny, 30),
        Weather(3,"14:00", R.drawable.weather_cloudy, R.string.weather_cloudy, 25),
        Weather(4,"15:00", R.drawable.weather_rainy, R.string.weather_rainy, 21),
        Weather(5,"16:00", R.drawable.weather_cloudy, R.string.weather_cloudy, 24)
    )
}