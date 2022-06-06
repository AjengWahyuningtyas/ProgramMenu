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

    private val listProfile = arrayOf("Akun", "Sandi", "Privasi", "Keluar")
    private val listImageProfile = arrayOf(R.drawable.user, R.drawable.login, R.drawable.privacy, R.drawable.exit)

    class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // val imageView: ImageView = itemView.findViewById(R.id.imageProductDetail)
        // val textView: TextView = itemView.findViewById(R.id.productTitle)
        var listProfile: TextView
        var listImageMenu: ImageView

        init {
            listProfile = itemView.findViewById(R.id.namaProfile)
            listImageMenu = itemView.findViewById(R.id.imageProfile)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_profile,parent, false)
        return ProfileViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listProfile.size
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.listProfile.text = listProfile[position]
        holder.listImageMenu.setImageResource(listImageProfile[position])

        holder.listImageMenu.setOnClickListener{
            val context = holder.listImageMenu.context
            val intent = Intent( context, DetailProdukActivity::class.java)

            intent.putExtra("Menu", listProfile!![position])
            intent.putExtra("Gambar", listImageProfile!![position])

            context.startActivity(intent)
        }
    }
}
