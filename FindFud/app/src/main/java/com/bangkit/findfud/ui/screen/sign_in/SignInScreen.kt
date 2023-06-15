package com.bangkit.findfud.ui.screen.sign_in

import android.widget.Toast
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.ContentAlpha.medium
import androidx.compose.material.Icon
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bangkit.findfud.R
import com.bangkit.findfud.ui.theme.BackBlue
import com.bangkit.findfud.ui.theme.TitleBlack
import com.bangkit.findfud.ui.theme.Shape

@Composable
fun SignInScreen(
    modifier: Modifier = Modifier,
    text: String = "Join Us with Google",
    loadingText: String = "Loading Account...",
    icon: Int = R.drawable.ic_google_logo,
    shape: Shape = Shape.medium,
    borderColor: Color = Color.LightGray,
    image: Int = R.drawable.logo_findfud,
    backgroundColor: Color = BackBlue,
    progressIndicatorColor: Color = TitleBlack,
    state: SignInState,
    onSignInClick: () -> Unit
) {
    val context = LocalContext.current
    LaunchedEffect(key1 = state.signInError) {
        state.signInError?.let { error ->
            Toast.makeText(
                context,
                error,
                Toast.LENGTH_LONG
            ).show()
        }
    }

    var clicked by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.Center
    ){
        Icon(
            painter = painterResource(id = image),
            contentDescription = "Google Button",
            tint = Color.Unspecified
        )
        Surface(
            modifier = modifier.clickable { clicked = !clicked },
            shape = shape,
            border = BorderStroke(width = 1.dp, color = borderColor),
            color = Color.White
        ) {
            Row(
                modifier = Modifier
                    .padding(
                        start = 12.dp,
                        end = 16.dp,
                        top = 12.dp,
                        bottom = 12.dp
                    )
                    .animateContentSize(
                        animationSpec = tween(
                            durationMillis = 300,
                            easing = LinearOutSlowInEasing
                        )
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = "Google Button",
                    tint = Color.Unspecified
                )
                Spacer(modifier = Modifier.width(8.dp))
                androidx.compose.material.Text(text = if (clicked) loadingText else text)
                if (clicked) {
                    Spacer(modifier = Modifier.width(16.dp))
                    CircularProgressIndicator(
                        modifier = Modifier
                            .height(16.dp)
                            .width(16.dp),
                        strokeWidth = 2.dp,
                        color = progressIndicatorColor
                    )
                    onSignInClick()
                }
            }
        }
    }
}

//@Composable
//@Preview
//private fun SignInScreenPreview() {
//    SignInScreen(
//        text = "Sign Up with Google",
//        loadingText = "Creating Account...",
//        onSignInClick = {}
//    )
//}