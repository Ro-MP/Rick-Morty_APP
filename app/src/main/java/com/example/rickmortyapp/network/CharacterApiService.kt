package com.example.rickmortyapp.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

// Establece el llamado a la API
// Convertir y pasar los datos del Json al objeto de Character

class CharacterApiService {
     //Ruta base de nuestra API
     companion object{
          lateinit var retrofit: Retrofit
          fun getClient(): Retrofit {
               retrofit = Retrofit.Builder()
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .baseUrl("https://rickandmortyapi.com/api/")
                    .build()
               return retrofit
          }
     }
}

interface CharacterApiService {

}