package id.ajeng.recycleviewnew.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.ajeng.recycleviewnew.Activity.DetailProdukActivity
import id.ajeng.recycleviewnew.R

class ProfileAdapter  : RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {

    private val listMenu = arrayOf("Akun", "Sandi", "Privasi", "Keluar")
    private val listImageMenu = arrayOf(R.drawable.user, R.drawable.login, R.drawable.privacy, R.drawable.exit)

    class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // val imageView: ImageView = itemView.findViewById(R.id.imageProductDetail)
        // val textView: TextView = itemView.findViewById(R.id.productTitle)
        var listMenu: TextView
        var listImageMenu: ImageView

        init {
            listMenu = itemView.findViewById(R.id.namaBuah)
            listImageMenu = itemView.findViewById(R.id.imageBuah)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_makanan,parent, false)
        return ProfileViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMenu.size
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.listMenu.text = listMenu[position]
        holder.listImageMenu.setImageResource(listImageMenu[position])

        holder.listImageMenu.setOnClickListener{
            val context = holder.listImageMenu.context
            val intent = Intent( context, DetailProdukActivity::class.java)

            intent.putExtra("Menu", listMenu!![position])
            intent.putExtra("Gambar", listImageMenu!![position])

            context.startActivity(intent)
        }
    }
}
