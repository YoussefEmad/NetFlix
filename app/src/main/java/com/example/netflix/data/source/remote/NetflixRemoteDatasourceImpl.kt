package com.example.netflix.data.source.remote

import javax.inject.Inject

class NetflixRemoteDatasourceImpl @Inject constructor(private val apiService: ApiService):NetflixRemoteDatasource {
    override suspend fun getMovies(): NetflixResponse {
        return apiService.getMovies(2024)
    }
}