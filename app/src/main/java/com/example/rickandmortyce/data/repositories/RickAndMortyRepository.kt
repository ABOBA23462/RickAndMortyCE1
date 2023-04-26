package com.example.rickandmortyce.data.repositories

import com.example.rickandmortyce.data.remote.apiservice.CharacterApiService
import com.example.rickandmortyce.models.DataItem
import com.example.rickandmortyce.models.RickAndMortyResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RickAndMortyRepository @Inject constructor(
    private val service: CharacterApiService
) {

    fun fetchCharacters(): Flow<RickAndMortyResponse<DataItem>> = flow {
        val fetchCharacter = service.fetchCharacters()
        emit(fetchCharacter)
    }
}