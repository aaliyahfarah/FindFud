package com.bangkit.findfud.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bangkit.findfud.R
import com.bangkit.findfud.model.Weather
import com.bangkit.findfud.ui.theme.FindFudTheme

@Composable
fun WeatherItem(
    weather: Weather,
    modifier: Modifier = Modifier,
){
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = weather.timeWeather,
            fontSize = 12.sp,
            modifier = Modifier.paddingFromBaseline(top = 8.dp, bottom = 8.dp)
        )
        Image(
            painter = painterResource(weather.imageWeather),
            contentDescription = null,
            modifier = Modifier
                .size(30.dp)
        )
        Text(
            text = "${weather.temperatureWeather}°",
            fontSize = 15.sp,
            modifier = Modifier.paddingFromBaseline(top = 8.dp, bottom = 8.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun WeatherItemPreview() {
    FindFudTheme {
        WeatherItem(
            weather = Weather(
                1,
                "12:00",
                R.drawable.weather_sunny,
                R.string.weather_sunny,
                27),
            modifier = Modifier
        )
    }
}