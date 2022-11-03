package com.etobon.appp2
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DAOmovies {

    @Query("SELECT * FROM EntidadMovie")
    suspend fun obtenerMovies(): List<EntidadMovie>
    @Query("SELECT * From EntidadMovie WHERE muid=:movieIds")
    suspend fun obtenerMovieid(movieIds:Int)
    @Insert
    suspend fun agregarPeliculaid(movieIds: EntidadMovie)

    @Query("DELETE FROM EntidadMovie WHERE muid=:movieIds")
    suspend fun deletemovie(movieIds:Int)

}