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
fun CurrentWeatherWidget(
    weather: Weather,
    modifier: Modifier = Modifier,
){
    Column (
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        Text(
            text = weather.timeWeather,
            fontSize = 15.sp
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = modifier
        ){
            Image(
                painter = painterResource(weather.imageWeather),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
            )
            Text(
                text = "${weather.temperatureWeather}°",
                fontSize = 42.sp,
                modifier = Modifier.paddingFromBaseline(top = 8.dp, bottom = 8.dp)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CurrentWeatherPreview() {
    FindFudTheme {
        CurrentWeatherWidget(
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