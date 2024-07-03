package com.example.netflix.data.repository

import com.example.netflix.data.source.remote.NetflixRemoteDatasource
import com.example.netflix.data.source.remote.toNetflixModel
import com.example.netflix.domain.model.NetflixModel
import com.example.netflix.domain.repository.NetflixRepository
import javax.inject.Inject

class NetflixRepositoryImpl @Inject constructor(
    private val netflixRemoteDatasource: NetflixRemoteDatasource
):NetflixRepository {
    override suspend fun getMoviesList(): List<NetflixModel> {
         val moviesList = netflixRemoteDatasource.getMovies().results.map {
            it.toNetflixModel()
        }
        return moviesList
    }
}