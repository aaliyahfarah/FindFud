package com.bangkit.findfud.ui.screen.splash

//import android.util.Log
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.unit.dp
//import com.bangkit.findfud.R
//import kotlinx.coroutines.launch

//@Composable
//fun SplashScreen(navigateToHome: () -> Unit, navigateToLogin: () -> Unit) {
//
//    val context = LocalContext.current
//    val scope = rememberCoroutineScope()
//
//
//
//    Box(
//        modifier = Modifier
//            .background(MaterialTheme.colorScheme.primary)
//            .fillMaxSize()
//        ,
//        contentAlignment = Alignment.Center,
//
//        ) {
//        Image(
//            painter = painterResource(id = R.drawable.logo_findfud),
//            contentDescription = "Logo FindFud",
//            contentScale = ContentScale.FillHeight,
//            modifier = Modifier.height(206.dp)
//        )
//    }
//
//
//}