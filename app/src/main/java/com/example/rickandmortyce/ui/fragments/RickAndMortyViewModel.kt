package com.example.rickandmortyce.ui.fragments

import com.example.rickandmortyce.base.BaseViewModel
import com.example.rickandmortyce.data.repositories.RickAndMortyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RickAndMortyViewModel@Inject constructor(
    private val repository: RickAndMortyRepository
) : BaseViewModel() {

    fun fetchCharacter() = repository.fetchCharacters()
}