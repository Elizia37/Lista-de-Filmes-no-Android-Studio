package com.elizia.av1_1821312095

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elizia.av1_1821312095.databinding.ActivityCadastroBinding
import com.elizia.av1_1821312095.model.CadastroFilme
import com.elizia.av1_1821312095.model.Filme
import com.google.android.material.snackbar.Snackbar

class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding
    private val banco = CadastroFilme.getDatabase(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSalvar.setOnClickListener {
            Thread {
                val titulo = binding.edTitulo.text.toString()
                val descricao = binding.edDesc.text.toString()
                val diretor = binding.edDiretor.text.toString()
                val ano = binding.edAno.text.toString().toInt()
                banco.filmeDao().insert(Filme(0,titulo,diretor,ano,descricao))
                val alerta = Snackbar.make(it,"Salvo com sucesso!",Snackbar.LENGTH_SHORT)
                alerta.show()
            }.start()
            val trocaDeCadastro = Intent(this, MainActivity::class.java)
            startActivity(trocaDeCadastro)
        }
    }
}