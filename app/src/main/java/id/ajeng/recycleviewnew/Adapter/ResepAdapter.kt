package id.ajeng.recycleviewnew.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.ajeng.recycleviewnew.R

class ResepAdapter  : RecyclerView.Adapter<ResepAdapter.ViewHolder>() {

    private val listResep = arrayOf("Lapis Pandan Sagu", "Choi Pan")
    private val deskripsiResep = arrayOf("Lapis Pandan Sagu merupakan makanan asal Betawi", "Rasa bengkuang yang harum dipadukan dengan ebi kering yang nikmat membuat makanan khas Pontianak ini digemari oleh banyak orang")
    private val imageResep = arrayOf(R.drawable.lapisps, R.drawable.choipan )

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var listResep: TextView
        // var deskripsiResep: TextView
        var imageResep: ImageView

        init {
            listResep =  itemView.findViewById(R.id.namaRecipe)
            // deskripsiResep = itemView.findViewById(R.id.)
            imageResep = itemView.findViewById(R.id.imageRecipe)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_recipe,parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listResep.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.listResep.text = listResep[position]
        // holder.deskripsiResep.text = deskripsiResep[position]
        holder.imageResep.setImageResource(imageResep[position])
    }
}
