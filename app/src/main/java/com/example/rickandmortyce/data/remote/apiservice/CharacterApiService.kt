package com.example.rickandmortyce.data.remote.apiservice

import com.example.rickandmortyce.models.DataItem
import com.example.rickandmortyce.models.RickAndMortyResponse
import retrofit2.http.GET

interface CharacterApiService {

    @GET("character")
    suspend fun fetchCharacters(
    ): RickAndMortyResponse<DataItem>
}