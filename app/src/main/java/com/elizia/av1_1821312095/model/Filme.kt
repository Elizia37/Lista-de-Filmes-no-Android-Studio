package com.elizia.av1_1821312095.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//constroi a classe para o bd
@Entity(tableName = "filme_table")
class Filme(

    @PrimaryKey(autoGenerate = true)
    var id: Int,

    //@ColumnInfo(name = "foto_filme")
   // var img: Int,

    @ColumnInfo(name = "titulo_filme")
    var titulo: String,

    @ColumnInfo(name = "diretor_filme")
    var diretor: String,

    @ColumnInfo(name = "ano_filme")
    var ano: Int,

    @ColumnInfo(name = "descricao_filme")
    var descricao: String,

)



