package com.example.netflix.data.source.remote

interface NetflixRemoteDatasource {
    suspend fun getMovies(): NetflixResponse

}