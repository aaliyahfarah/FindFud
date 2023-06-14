package com.bangkit.findfud.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bangkit.findfud.R
import com.bangkit.findfud.ui.theme.FindFudTheme
import com.bangkit.findfud.ui.theme.TextBlack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(modifier: Modifier = Modifier) {
    SearchBar(
        query = "",
        onQueryChange = {},
        onSearch = {},
        active = false,
        onActiveChange = {},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.secondary,
                modifier = modifier.heightIn(20.dp)
            )
        },
        placeholder = {
            Text(stringResource(R.string.placeholder_search), color = TextBlack)
        },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "search",
                tint = MaterialTheme.colorScheme.secondary,
                modifier = modifier.heightIn(20.dp)
            )
        },
        shape = MaterialTheme.shapes.large,
        colors = SearchBarDefaults.colors(
            containerColor = Color.White
        ),
        modifier = modifier
            .padding(vertical = 10.dp)
            .fillMaxWidth()
            .heightIn(40.dp)
    ) {
    }
}

@Preview(showBackground = true)
@Composable
fun SearchPreview() {
    FindFudTheme {
        Search()
    }
}