package id.ajeng.recycleviewnew.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.ajeng.recycleviewnew.Activity.DetailProdukActivity
import id.ajeng.recycleviewnew.Model.Buah
import id.ajeng.recycleviewnew.R

class BuahAdapter  : RecyclerView.Adapter<BuahAdapter.ProductViewHolder>() {

    private val listBuah = arrayOf("Pisang", "Apel", "Jambu", "Naga")
    private val listImageBuah = arrayOf(R.drawable.banana, R.drawable.apel, R.drawable.guava, R.drawable.dragonfruit)
    private val satuan = arrayOf(
        "pack",
        "pcs",
        "kg",
        "gr"
    )

    private val harga = arrayOf(
        "Rp 10.500/" + satuan[0],
        "Rp 24.900/" + satuan[1],
        "Rp 28.900/800-1000" + satuan[3],
        "Rp 18.500/" + satuan[2],
    )


    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // val imageView: ImageView = itemView.findViewById(R.id.imageProductDetail)
        // val textView: TextView = itemView.findViewById(R.id.productTitle)
        var listBuah: TextView
        var listImageBuah: ImageView
        var harga: TextView

        init {
            listBuah = itemView.findViewById(R.id.namaBuah)
            listImageBuah = itemView.findViewById(R.id.imageBuah)
            harga = itemView.findViewById(R.id.hargaBuah)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_makanan,parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBuah.size
    }

    override fun onBindViewHolder(holder: BuahAdapter.ProductViewHolder, position: Int) {
        holder.listBuah.text = listBuah[position]
        holder.harga.text = harga[position]
        holder.listImageBuah.setImageResource(listImageBuah[position])

        holder.listImageBuah.setOnClickListener{
            val context = holder.listImageBuah.context
            val intent = Intent( context, DetailProdukActivity::class.java)

            intent.putExtra("Produk", listBuah!![position])
            intent.putExtra("Harga", harga!![position])
            intent.putExtra("Gambar", listImageBuah!![position])

            context.startActivity(intent)
        }
    }
}
