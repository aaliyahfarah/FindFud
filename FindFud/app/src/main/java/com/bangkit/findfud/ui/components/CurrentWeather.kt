package com.bangkit.findfud.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
fun CurrentWeather(
    weather: Weather,
    modifier: Modifier = Modifier,
){
    Row (
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text = weather.timeWeather,
            fontSize = 15.sp
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(2.dp),
            modifier = modifier
        ){
            Image(
                painter = painterResource(weather.imageWeather),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
            )
            Text(
                text = "${weather.temperatureWeather}°",
                fontSize = 32.sp,
                modifier = Modifier.paddingFromBaseline(top = 8.dp, bottom = 8.dp)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CurrentWeatherPreview() {
    FindFudTheme {
        CurrentWeather(
            weather = Weather(
                1,
                "Thu, May 18 12:20",
                R.drawable.weather_sunny,
                R.string.weather_sunny,
                27),
            modifier = Modifier
        )
    }
}