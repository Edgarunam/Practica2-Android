package com.etobon.appp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val room = Room.databaseBuilder(this,DBMovies::class.java, "pelicula").build()
        lifecycleScope.launch{
            room.daoMovies().agregarPeliculaid(EntidadMovie(1,"Spiderman","Super Heroes","2002"))
            room.daoMovies().agregarPeliculaid(EntidadMovie(1,"Spiderman 2","Super Heroes","2002"))
            room.daoMovies().agregarPeliculaid(EntidadMovie(1,"Spiderman 3","Super Heroes","2002"))

            var peliculas = room.daoMovies().getMovies()
            for(item in peliculas){
                println("${item.title}")
            }
        }

    }

}