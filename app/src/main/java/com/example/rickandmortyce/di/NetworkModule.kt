package com.example.rickandmortyce.di

import com.example.rickandmortyce.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Singleton
    val retrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun provideCharacterApiService() = retrofitClient.provideCharacterApiService()

    @Singleton
    @Provides
    fun provideLocationApiService() = retrofitClient.provideLocationApiService()
}