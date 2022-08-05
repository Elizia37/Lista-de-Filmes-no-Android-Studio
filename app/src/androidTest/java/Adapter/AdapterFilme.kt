package Adapter
// refazer
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import model.Filme


class AdapterFilme(private val context: Context, private val filme: MutableList<Filme>): RecyclerView.Adapter<AdapterFilme.FilmeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.Layout.rec_filme, parent, false)
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

        private val img = itemView.findViewById<ImageView>(R.id.imaFilme)
        private val Titulo: TextView = itemView.findViewById(R.id.Titulo)
        private val Diretor: TextView = itemView.findViewById(R.id.Diretor)
        private val Ano: TextView = itemView.findViewById(R.id.Nome)
        private val Descricao: TextView = itemView.findViewById(R.id.Idade)


        }


}