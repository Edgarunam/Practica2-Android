package com.etobon.appp2
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [EntidadMovie::class],
    version = 1
)
abstract class DBMovies: RoomDatabase(){
    abstract fun daoMovies():DAOmovies
}

