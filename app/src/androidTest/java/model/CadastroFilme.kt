package model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Filme::class), version = 1, exportSchema = false)
abstract class CadastroFilme: RoomDatabase() {

    abstract fun filmeDao(): FilmeDao


    companion object {
        @Volatile
        private var INSTANCE: CadastroFilme? = null

        fun getDatabase(context:Context): CadastroFilme {
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CadastroFilme::class.java,
                    "filme_database").build()
                INSTANCE = instance
                instance
            }
        }
    }
}