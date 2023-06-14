package com.bangkit.findfud.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.findfud.R
import com.bangkit.findfud.model.DummyResto
import com.bangkit.findfud.model.DummyWeather
import com.bangkit.findfud.model.Weather
import com.bangkit.findfud.ui.components.*
import com.bangkit.findfud.ui.theme.BackBlue
import com.bangkit.findfud.ui.theme.FindFudTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(BackBlue)
            .padding(20.dp),

        ) {
        SectionText(stringResource(R.string.user_name))
        SearchLocation()
        WeatherCard()
        SectionText(stringResource(R.string.near_food))
        RestoColumn()
    }
}

@Composable
fun SearchLocation(){
    Search()
}

@Composable
@Preview(showBackground = true)
fun SearchLocationPreview() {
    FindFudTheme {
        SearchLocation()
    }
}

@Composable
fun WeatherRow(
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(30.dp),
        modifier = modifier
    ) {
        items(DummyWeather.dummyWeather, key = { it.idWeather }) { weather ->
            WeatherItem(weather)
        }
    }
}

@Composable
fun CurrentWeatherData(
){
    CurrentWeather(
        Weather(
            1,
            "Thu, May 18 12:20",
            R.drawable.weather_sunny,
            R.string.weather_sunny,
            27)
    )
}

@Composable
fun WeatherCard(
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier
            .padding(bottom = 30.dp)
            .height(160.dp)
            .clip(CardDefaults.shape)
            .background(Color.White)
            .padding(15.dp)
    ){
        Column (
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
        ){
            CurrentWeatherData()
            WeatherRow()
        }
    }
}

@Composable
@Preview(showBackground = true)
fun WeatherCardPreview() {
    FindFudTheme {
        WeatherCard()
    }
}

@Composable
fun RestoColumn(
    modifier: Modifier = Modifier
){
    Box(modifier = modifier){
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = modifier.height(200.dp)
        ) {
            items(DummyResto.dummyNearResto, key = { it.idResto }) { resto ->
                RestoItem(resto)
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}