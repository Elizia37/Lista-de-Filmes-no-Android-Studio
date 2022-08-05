package com.elizia.av1_1821312095

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.elizia.av1_1821312095.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root //passar o arq ct main.xml
        setContentView(view)

        val recyclerView_filmes = binding.recFilme
        recyclerView_filmes.layoutManager = LinearLayoutManager(this)
        recyclerView_filmes.setHasFixedSize(true) //dá desenpenho a lista
        binding.fabCadastro.setOnClickListener {
            val trocaDeCadastro = Intent(this, CadastroActivity::class.java)
            startActivity(trocaDeCadastro)
        }


    }

}