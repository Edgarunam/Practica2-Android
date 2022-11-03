package com.etobon.appp2
import android.icu.text.CaseMap.Title
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class EntidadMovie (
    @PrimaryKey val muid :Int,
    @ColumnInfo(name = "Titulo") val title: String?,
    @ColumnInfo(name = "Genero") val genre: String?,
    @ColumnInfo(name = "Fecha") val fecha: String?


)