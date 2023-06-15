package com.bangkit.findfud.util

import android.location.Location

interface LocationTrack {
    suspend fun getCurrentLocation(): Location?
}