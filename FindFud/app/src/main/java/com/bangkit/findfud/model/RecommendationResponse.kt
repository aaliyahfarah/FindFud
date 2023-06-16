package com.bangkit.findfud.model

import com.google.gson.annotations.SerializedName

data class RecommendationResponse(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("message")
	val message: String? = null
)

data class DataItem(

	@field:SerializedName("nama_makanan")
	val namaMakanan: String? = null,

	@field:SerializedName("nama_resto")
	val namaResto: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)
