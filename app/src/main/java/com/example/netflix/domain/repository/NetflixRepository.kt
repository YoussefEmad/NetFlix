package com.example.netflix.domain.repository

import com.example.netflix.domain.model.NetflixModel

interface NetflixRepository {
    suspend fun getMoviesList(): List<NetflixModel>
}