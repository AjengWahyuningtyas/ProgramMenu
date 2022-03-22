package id.ajeng.recycleviewnew

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MakananAdapter {
    class MakananAdapter(private val listMakanan: ArrayList<Makanan>) : RecyclerView.Adapter<MakananAdapter.CardViewHolder>() {
        inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
            var tvDeskripsi: TextView = itemView.findViewById(R.id.tv_item_deskripsi)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_makanan,parent, false)
            return CardViewHolder(view)
        }

        override fun getItemCount(): Int {
            return listMakanan.size
        }

        override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
            val makanan =listMakanan[position]

            
            Glide.with(holder.itemView.context)
                .load(makanan.photo)
                .apply(RequestOptions())
                .into(holder.imgPhoto)

            holder.tvName.text = makanan.name
            holder.tvDeskripsi.text = makanan.deskripsi

            holder.itemView.setOnClickListener{
                Toast.makeText(holder.itemView.context, "Kamu memilih" +listMakanan[holder.adapterPosition].name, Toast.LENGTH_SHORT)
            }
        }


    }

}
