package com.example.rickmortyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.rickmortyapp.model.Character
import com.example.rickmortyapp.network.ApiCharacter
import com.example.rickmortyapp.network.CharacterApiService
import com.example.rickmortyapp.view.CharacterAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private var characters = mutableListOf<Character>()
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv_characters)

        showCharacters()
        val char : List<Character> = characters

        recyclerView.adapter = CharacterAdapter(char, this)
        recyclerView.setHasFixedSize(true)

    }

    fun showCharacters(){
        val call : Call<List<Character>> = CharacterApiService.getClient().create(ApiCharacter::class.java).getCharacters()
        call.enqueue(object : Callback<List<Character>> {

            override fun onResponse(call: Call<List<Character>>, response: Response<List<Character>>, ) {
                characters = response.body() as MutableList<Character>
                /*
                if (response.isSuccessful){
                    characters = response.body() as MutableList<Character>
                }

                 */
            }

            override fun onFailure(call: Call<List<Character>>, t: Throwable) {
                    t.message?.let { Log.e("ERROR: AAA!!!! ", it) }
                t.stackTrace
            }

        })
    }

}