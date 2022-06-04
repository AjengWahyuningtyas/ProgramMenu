package id.ajeng.recycleviewnew.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.ajeng.recycleviewnew.Data.BuahData
import id.ajeng.recycleviewnew.Model.Buah
import id.ajeng.recycleviewnew.Model.BuahViewsModel
import id.ajeng.recycleviewnew.R

class BuahAdapter  : RecyclerView.Adapter<BuahAdapter.ViewHolder>() {

    private val listBuah = arrayOf("Pisang", "Apel", "Jambu", "Naga")
    private val listImageBuah = arrayOf(R.drawable.banana, R.drawable.apel, R.drawable.guava, R.drawable.dragonfruit)

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // val imageView: ImageView = itemView.findViewById(R.id.imageProductDetail)
        // val textView: TextView = itemView.findViewById(R.id.productTitle)
        var listBuah: TextView
        var listImageBuah: ImageView

        init {
            listBuah = itemView.findViewById(R.id.namaBuah)
            listImageBuah = itemView.findViewById(R.id.imageBuah)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_makanan,parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBuah.size
    }

    override fun onBindViewHolder(holder: BuahAdapter.ViewHolder, position: Int) {
        holder.listBuah.text = listBuah[position]
        holder.listImageBuah.setImageResource(listImageBuah[position])
    }
}
