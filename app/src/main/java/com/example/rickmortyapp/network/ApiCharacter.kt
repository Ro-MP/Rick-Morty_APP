package com.example.rickmortyapp.network

import retrofit2.Call
import com.example.rickmortyapp.model.Character
import retrofit2.http.GET

// Describe todas las operaciones que solicitaremos de la API
// Como agregar, editar, listar, etc
interface ApiCharacter {
    // Metodo de envio HTTP que permite obtener el JSON
    // Operacion encargada de traer el listado de Characters
    @GET("character/1,183")
    fun getCharacters() : String
}