package com.example.rickmortyapp.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rickmortyapp.R
import com.example.rickmortyapp.model.Character
import com.squareup.picasso.Picasso

// Incorporar dentro del RecyclerView el diseño y componentes que contiene el archivo
// item_character.xml, a este procedimiento se le conoce con el termino "Inflate"
class CharacterAdapter(private val characters : List<Character>, private val context : Context) : RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


            val ivCharacterImage: ImageView = itemView.findViewById(R.id.iv_character_image)
            val tvCharacterName : TextView = itemView.findViewById(R.id.tv_character_name)
            val tvCharacterStatus : TextView = itemView.findViewById(R.id.tv_character_status)
            val tvCharacterSpecies : TextView = itemView.findViewById(R.id.tv_character_species)
            val tvCharacterGender : TextView = itemView.findViewById(R.id.tv_character_gender)
            val tvCharacterLocation : TextView = itemView.findViewById(R.id.tv_character_location)
    }

    // Especifica XML que se desea Inflar en el RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_character, parent, false)
        return ViewHolder(view)
    }

    // Rellena los componentes del item_character.xml
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            //Picasso.get().load(characters.get(position).image).into(this.ivCharacterImage)
            //this.tvCharacterName.text = characters.get(position).name
            //this.tvCharacterStatus.text = characters.get(position).status
            //this.tvCharacterSpecies.text = characters.get(position).species
            //this.tvCharacterGender.text = characters.get(position).gender
            //this.tvCharacterLocation.text = characters.get(position).location.name
        }
    }

    override fun getItemCount(): Int {
        return characters.size
    }

}