package com.example.rickmortyapp.model

data class Character (
    val info : Info,
    val results : List<Results>
)

data class Info (
    val count : Int? = null,
    val pages : Int? = null,
    val next : String?,
    val prev : String?
        )

data class Results (
    val id : Int? = null,
    val name : String? = null,
    val status : String? = null,
    val species : String? = null,
    val type : String? = null,
    val gender : String? = null,
    val origin : Origin,
    val location : Location,
    val image : String? = null,
    val episode : List<String>? = null,
    val url : String? = null,
    val created : String? = null
        )

data class Origin (
    val name: String? = null,
    val url: String? = null
        )

data class Location (
    val name: String? = null,
    val url: String? = null
        )

