package com.example.rickmortyapp.model

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface CharactersApi {

    @GET("character")
    fun getCharacters(): Call<Character>
}