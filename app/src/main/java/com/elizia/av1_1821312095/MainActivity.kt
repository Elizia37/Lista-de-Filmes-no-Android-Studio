package com.elizia.av1_1821312095

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView_filmes = findViewById<RecyclerView>(R.id.rec_filme)
        recyclerView_filmes.layoutManager = LinearLayoutManager(this)
        recyclerView_filmes.setHasFixedSize(true) //dá desenpenho a lista

    }
}