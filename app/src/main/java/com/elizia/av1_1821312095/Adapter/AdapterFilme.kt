package com.elizia.av1_1821312095.Adapter
// refazer
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.elizia.av1_1821312095.R
import com.elizia.av1_1821312095.model.Filme


class AdapterFilme(private val context: Context, private val filme: MutableList<Filme>): RecyclerView.Adapter<AdapterFilme.FilmeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.filmes_item, parent, false)
        val holder = FilmeViewHolder(itemLista)
        return holder
    }

    override fun getItemCount() = filme.size

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        holder.bind(filme[position])
    }

    fun atualizar(novalista: List<Filme>){
        filme.clear()
        filme.addAll(novalista)
        notifyDataSetChanged()
    }
    inner class FilmeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(filme: Filme) {

        }

      //  private val img = itemView.findViewById<ImageView>()
        private val Titulo: TextView = itemView.findViewById(R.id.tituloFilme)
        private val Diretor: TextView = itemView.findViewById(R.id.diretorFilme)
        private val Ano: TextView = itemView.findViewById(R.id.anoFilme)
        private val Descricao: TextView = itemView.findViewById(R.id.descricaoFilme)

        }
}