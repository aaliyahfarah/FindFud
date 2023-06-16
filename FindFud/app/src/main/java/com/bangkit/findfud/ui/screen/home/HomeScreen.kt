package com.bangkit.findfud.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.findfud.R
import com.bangkit.findfud.model.DummyResto
import com.bangkit.findfud.model.Weather
import com.bangkit.findfud.ui.components.*
import com.bangkit.findfud.ui.theme.BackBlue

@Composable
fun HomeScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(BackBlue)
            .padding(20.dp)
            .fillMaxSize(),
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
    LocationButton(modifier = Modifier)
}

@Composable
fun WeatherCard(
    modifier: Modifier = Modifier
){
    Box(
    contentAlignment = Alignment.Center,
    modifier = Modifier
        .padding(bottom = 20.dp, top=15.dp)
        .height(120.dp)
        .fillMaxWidth()
        .clip(CardDefaults.shape)
        .background(Color.White)
        .padding(15.dp)
){
    CurrentWeatherWidget(
        Weather(
            1,
            "Thu, May 18 12:20",
            R.drawable.weather_sunny,
            R.string.weather_sunny,
            27)
    )
}
}

@Composable
fun RestoColumn(
    modifier: Modifier = Modifier
){
    Box(modifier = modifier){
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = modifier.height(400.dp)
        ) {
            items(DummyResto.dummyNearResto, key = { it.namaResto}) { resto ->
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