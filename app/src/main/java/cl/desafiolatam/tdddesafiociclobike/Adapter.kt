package cl.desafiolatam.tdddesafiociclobike

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CyclobikeViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvCiclovia: TextView
    val tvComuna: TextView

    init {
        tvCiclovia = itemView.findViewById(R.id.tvCiclovia)
        tvComuna = itemView.findViewById(R.id.tvComuna)
    }
}

class CycloAdapter(val lista: List<Ciclovia>) : RecyclerView.Adapter<CyclobikeViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CyclobikeViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CyclobikeViewholder(view)
    }

    override fun onBindViewHolder(holder: CyclobikeViewholder, position: Int) {
        val ciclovia = lista[position]
        Log.d("CycloAdaoter", ciclovia.toString())

        holder.tvCiclovia.text = ciclovia.nombre
        holder.tvComuna.text = ciclovia.comuna

    }

    override fun getItemCount(): Int {
        return lista.size
    }
}