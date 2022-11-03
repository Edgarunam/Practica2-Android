package com.etobon.appp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(val movies:List<Movies>):RecyclerView.Adapter<MovieAdapter.MovieHolder>(){

    class MovieHolder(val view:View):RecyclerView.ViewHolder(view){
        fun render(movie:Movies){

            val nameMov:TextView
            val date:TextView
            val generoM:TextView
            nameMov = view.findViewById(R.id.nameMovie)
            date = view.findViewById(R.id.Date)
            generoM = view.findViewById(R.id.Genero)


            nameMov.text = movie.Title
            date.text = movie.Date
            generoM.text = movie.Genre

        }
    }

    override fun getItemCount():Int = movies.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val layoutInflate = LayoutInflater.from(parent.context)
        return MovieHolder(layoutInflate.inflate(R.layout.movie_item_design,parent,false))
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        holder.render(movies[position])
    }



}
