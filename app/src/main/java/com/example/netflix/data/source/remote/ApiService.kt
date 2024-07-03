package com.example.netflix.data.source.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("discover/movie")
    suspend fun getMovies(
        @Query("primary_release_year") year :Int
    ): NetflixResponse


}