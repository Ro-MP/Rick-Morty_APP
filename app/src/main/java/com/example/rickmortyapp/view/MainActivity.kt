package com.example.rickmortyapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.rickmortyapp.R
import com.example.rickmortyapp.model.Character
import com.example.rickmortyapp.model.CharactersApi
import com.example.rickmortyapp.model.Repository
import com.example.rickmortyapp.model.Results
import com.example.rickmortyapp.viewmodel.CharacterViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    /*
    private var characters = mutableListOf<Character>()
    private lateinit var recyclerView: RecyclerView
     */
    private val viewModel: CharacterViewModel by viewModels()

    lateinit var tvtext : TextView
    var character = mutableListOf<Results>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvtext = findViewById(R.id.tv_prueba)

        val characterObserver = Observer<Results> {
            tvtext.text = it.image
        }

        viewModel.characterName.observe(this, characterObserver)
        viewModel.getDatosApi()


    }

/*
    fun getDatosApi(){
        var repository = Repository(this@MainActivity)
        val call = repository.getRetrofit().create(CharactersApi::class.java).getCharacters()
        call.enqueue(object : Callback<Character> {
            override fun onResponse(call: Call<Character>, response: Response<Character>) {
                runOnUiThread{
                    if(response.isSuccessful) {
                        tvtext.text = response.body()?.results?.get(0)?.name
                        val characters = response.body()?.results ?: emptyList()
                        character.clear()
                        character.addAll(characters)
                    }else{
                        Toast.makeText(this@MainActivity, "No encuentro eso", Toast.LENGTH_LONG).show()
                    }
                }

            }

            override fun onFailure(call: Call<Character>, t: Throwable) {
                Toast.makeText(this@MainActivity, "No encuentro eso", Toast.LENGTH_LONG).show()
            }

        })
    }


 */






}