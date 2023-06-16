package com.bangkit.findfud.ui.navigation

import android.util.Log

sealed class Screen(val route: String){
    object Splash : Screen("splash_screen")
    object SignIn : Screen("sign_in")
    object Home : Screen("home")
    object Profile : Screen("profile")
    object Detail : Screen("detail")
    object Search : Screen("search?q={q}") {
        fun createSearchRoute(query: String, tags: List<String> = listOf()): String {
            val route = "search?q=$query"
            val sb = StringBuilder().append(route)
            Log.d("CreateSearchLocation", sb.toString())
            return sb.toString()
        }
    }

    companion object {
        val menu = listOf(
            Home.route, Search.route, Profile.route
        )
    }
}
