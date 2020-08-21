package cl.desafiolatam.tdddesafiociclobike

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CyclobikeViewholder(itemView: View) : RecyclerView.ViewHolder(itemView)

class CycloAdapter(val lista: List<Ciclovia>) : RecyclerView.Adapter<CyclobikeViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CyclobikeViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CyclobikeViewholder(view)
    }

    override fun onBindViewHolder(holder: CyclobikeViewholder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}