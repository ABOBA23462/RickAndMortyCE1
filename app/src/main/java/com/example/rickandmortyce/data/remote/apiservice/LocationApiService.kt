package com.example.rickandmortyce.data.remote.apiservice

import com.example.rickandmortyce.models.DataItem
import com.example.rickandmortyce.models.RickAndMortyResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface LocationApiService {

    @GET("api/location")
    suspend fun fetchLocation(
    ): RickAndMortyResponse<DataItem>
}