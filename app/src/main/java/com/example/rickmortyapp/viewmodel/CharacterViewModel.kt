package com.example.rickmortyapp.viewmodel

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rickmortyapp.model.Character
import com.example.rickmortyapp.model.CharactersApi
import com.example.rickmortyapp.model.Repository
import com.example.rickmortyapp.model.Results
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.Objects

class CharacterViewModel : ViewModel() {
    val characterName: MutableLiveData<Results> = MutableLiveData<Results>()


    fun getDatosApi(){
        var repository = Repository()
        val call = repository.getRetrofit().create(CharactersApi::class.java).getCharacters()

        call.enqueue(object : Callback<Character> {
            override fun onResponse(call: Call<Character>, response: Response<Character>) {
                if(response.isSuccessful) {
                    characterName.value = response.body()?.results?.get(0)
                }else{

                }

            }

            override fun onFailure(call: Call<Character>, t: Throwable) {

            }

        })
    }



}