package com.bangkit.findfud.model

object DummyResto {
    val dummyResto = listOf(
        Resto(1, "KFC Naughty", "Jasmine Tea, Water, Lemon Tea","0,1 km"),
        Resto(2, "Cafe Summer", "Jasmine Tea, Waffle Ice Cream, Lemon Tea", "0,2 km"),
        Resto(3, "Cafe Baru", "Mango Sorbet, Jasmine Tea, Lemon Tea","0,1 km"),
        Resto(4, "Starbucks", "Jasmine Tea, Waffle Ice Cream, Lemon Tea","0,3 km")
    )

    val dummyNearResto = dummyResto.shuffled()
}