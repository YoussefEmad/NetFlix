package com.example.netflix.data.source.remote

import com.google.gson.annotations.SerializedName

data class NetflixResponse (
    @SerializedName("page") var page: Int? = null,
    @SerializedName("results") var results: ArrayList<NetflixDto> = arrayListOf(),
    @SerializedName("total_pages") var totalPages: Int? = null,
    @SerializedName("total_results") var totalResults: Int? = null
)
