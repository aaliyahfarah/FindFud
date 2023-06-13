package com.bangkit.findfud.model

import com.bangkit.findfud.R

object DummyFood {
    val dummyFood = listOf(
        Food(R.drawable.food_water, "Mineral Water"),
        Food(R.drawable.food_lemontea, "Lemon Tea"),
        Food(R.drawable.food_icecream, "Waffle Ice Cream"),
        Food(R.drawable.food_jasminetea, "Jasmine Tea"),
        Food(R.drawable.food_nopict, "Mango Sorbet")
    )
    val dummySuggestionFood = dummyFood.shuffled()
}
