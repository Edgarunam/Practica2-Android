package com.etobon.appp2
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DAOmovies {

    @Query("SELECT * FROM EntidadMovie")
    suspend fun getMovies(): List<EntidadMovie>
    @Query("SELECT * From EntidadMovie where muid IN (:movieIds)")
    suspend fun obtenerMovieid(movieIds:Int)
    @Insert
    suspend fun agregarPeliculaid(movieIds: EntidadMovie)

    @Query("DELETE FROM EntidadMovie WHERE muid IN(:movieIds)")
    suspend fun deletemovie(movieIds:Int)

}