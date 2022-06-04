package id.ajeng.recycleviewnew.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.ajeng.recycleviewnew.Model.Buah
import id.ajeng.recycleviewnew.R

class BuahAdapter {
    class BuahAdapter(private val listBuah: ArrayList<Buah>) : RecyclerView.Adapter<BuahAdapter.CardViewHolder>() {
        inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
            var tvHarga: TextView = itemView.findViewById(R.id.tv_item_harga)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_makanan,parent, false)
            return CardViewHolder(view)
        }

        override fun getItemCount(): Int {
            return listBuah.size
        }

        override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
            val makanan =listBuah[position]

            
            Glide.with(holder.itemView.context)
                .load(makanan.photo)
                .apply(RequestOptions())
                .into(holder.imgPhoto)

            holder.tvName.text = makanan.name
            holder.tvHarga.text = makanan.harga

            holder.itemView.setOnClickListener{
                Toast.makeText(holder.itemView.context, "Kamu memilih" +listBuah[holder.adapterPosition].name, Toast.LENGTH_SHORT)
            }
        }
    }
}
