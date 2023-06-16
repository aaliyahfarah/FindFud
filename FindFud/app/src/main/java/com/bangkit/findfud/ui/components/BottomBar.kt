package com.bangkit.findfud.ui.components

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.bangkit.findfud.R
import com.bangkit.findfud.ui.navigation.NavigationItem
import com.bangkit.findfud.ui.navigation.Screen
import com.bangkit.findfud.ui.theme.BackYellow

@Composable
private fun BottomBar(
    modifier: Modifier = Modifier.
    background(BackYellow)
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(R.string.menu_search),
                icon = Icons.Default.Search,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(R.string.menu_profile),
                icon = Icons.Default.Person,
                screen = Screen.Home
            ),
        )


    }
}

@Preview
@Composable
fun BottomBarPreview() {
    BottomBar()
}