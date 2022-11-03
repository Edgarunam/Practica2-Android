package com.etobon.appp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val movies = listOf(
        Movies("Spiderman","Super Heroes","2002"),
        Movies("Xmen","Super Heroes","2002"),
        Movies("Spiderman 2","Super Heroes","2002"),
        Movies("Spiderman 3","Super Heroes","2002"),
        Movies("Spiderman","Super Heroes","2002"),
        Movies("Xmen","Super Heroes","2002"),
        Movies("Spiderman 2","Super Heroes","2002"),
        Movies("Spiderman 3","Super Heroes","2002"),
        Movies("Spiderman","Super Heroes","2002"),
        Movies("Xmen","Super Heroes","2002"),
        Movies("Spiderman 2","Super Heroes","2002"),
        Movies("Spiderman 3","Super Heroes","2002"),
        Movies("Spiderman","Super Heroes","2002"),
        Movies("Xmen","Super Heroes","2002"),
        Movies("Spiderman 2","Super Heroes","2002"),
        Movies("Spiderman 3","Super Heroes","2002"),
        Movies("Spiderman","Super Heroes","2002"),
        Movies("Xmen","Super Heroes","2002"),
        Movies("Spiderman 2","Super Heroes","2002"),
        Movies("Spiderman 3","Super Heroes","2002"),
        Movies("Spiderman","Super Heroes","2002"),
        Movies("Xmen","Super Heroes","2002"),
        Movies("Spiderman 2","Super Heroes","2002"),
        Movies("Spiderman 3","Super Heroes","2002"),Movies("Spiderman","Super Heroes","2002"),
        Movies("Xmen","Super Heroes","2002"),
        Movies("Spiderman 2","Super Heroes","2002"),
        Movies("Spiderman 3","Super Heroes","2002"),
        Movies("Spiderman","Super Heroes","2002"),
        Movies("Xmen","Super Heroes","2002"),
        Movies("Spiderman 2","Super Heroes","2002"),
        Movies("Spiderman 3","Super Heroes","2002"),Movies("Spiderman","Super Heroes","2002"),
        Movies("Xmen","Super Heroes","2002"),
        Movies("Spiderman 2","Super Heroes","2002"),
        Movies("Spiderman 3","Super Heroes","2002"),
        Movies("Spiderman","Super Heroes","2002"),
        Movies("Xmen","Super Heroes","2002"),
        Movies("Spiderman 2","Super Heroes","2002"),
        Movies("Spiderman 3","Super Heroes","2002"),



    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()
    }
    fun initRecycler(){
        val rvMovies:RecyclerView = findViewById(R.id.rcvMovies)
        rvMovies.layoutManager = LinearLayoutManager(this)
        val adapter = MovieAdapter(movies)
        rvMovies.adapter = adapter
    }
}