package com.bangkit.findfud.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bangkit.findfud.ui.theme.FindFudTheme
import com.bangkit.findfud.ui.theme.TextBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocationButton(modifier: Modifier = Modifier) {
    Button(
        modifier = Modifier
            .fillMaxWidth(),
        onClick = {},
        colors = ButtonDefaults.buttonColors(Color.White),
        shape = RoundedCornerShape(16.dp)
    ) {
        Icon(
            imageVector = Icons.Default.LocationOn,
            contentDescription = "location",
            tint = MaterialTheme.colorScheme.secondary,
            modifier = modifier.heightIn(20.dp)
        )
        Text(
            text = "Senayan",
            color = TextBlue,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LocationButtonPreview() {
    FindFudTheme {
        LocationButton(
        )
    }
}