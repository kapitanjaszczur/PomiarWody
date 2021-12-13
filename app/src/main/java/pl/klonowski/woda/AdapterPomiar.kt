package pl.klonowski.woda

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterPomiar (val ListaPomiarow : ArrayList<Pomiar>) : RecyclerView.Adapter<AdapterPomiar.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvadres = itemView.findViewById<TextView>(R.id.textViewAdres)
        val tvwoda = itemView.findViewById<TextView>(R.id.textViewWoda)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pomiar : Pomiar = ListaPomiarow[position]
        val tva = holder.tvadres
        tva.text = pomiar.adres
        val tvw = holder.tvwoda
        tvw.text = pomiar.ilosc
    }

    override fun getItemCount(): Int {
        return ListaPomiarow.size
    }
}