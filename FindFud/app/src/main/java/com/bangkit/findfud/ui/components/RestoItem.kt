package com.bangkit.findfud.ui.components

import android.view.MenuItem
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bangkit.findfud.R
import com.bangkit.findfud.model.Resto
import com.bangkit.findfud.ui.theme.FindFudTheme
import com.bangkit.findfud.ui.theme.NavGrey
import com.bangkit.findfud.ui.theme.TextBlue

@Composable
fun RestoItem (
    resto: Resto,
    modifier: Modifier = Modifier,
){
    Card (
        modifier = modifier.fillMaxWidth().height(85.dp),
        shape = RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
    ){
        Column {
            Column(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                Text(
                    text = resto.namaResto,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp,
                    color = TextBlue
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier){
                    Image(
                        painter = painterResource(R.drawable.ic_baseline_restaurant_menu_24),
                        contentDescription = "menu"
                    )
                    Text(
                        text = resto.menuResto,
                        maxLines = 2,
                        color = NavGrey,
                        fontSize = 12.sp,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier){
                    Image(
                        painter = painterResource(R.drawable.ic_baseline_location_on_24),
                        contentDescription = "distance"
                    )
                    Text(
                        text = resto.distanceResto,
                        maxLines = 1,
                        color = NavGrey,
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun RestoItemPreview() {
    FindFudTheme {
        RestoItem(
            resto = Resto(
                3,
                "Cafe Baru",
                "Jasmine Tea, Water, Lemon Tea",
                "0,2 km",
                "jalan mawar"
            ),
            modifier = Modifier
        )
    }
}