package com.bangkit.findfud.model


import com.bangkit.findfud.model.Error as ErrorModel

sealed class NetworkResult<out M> {
    class Success<out M>(val data: M) : NetworkResult<M>()
    class Error(val data: ErrorModel? = null) : NetworkResult<Nothing>()
    class Failure(val message: String) : NetworkResult<Nothing>()
    object Loading : NetworkResult<Nothing>()
    object Empty : NetworkResult<Nothing>()
}