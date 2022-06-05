package id.ajeng.recycleviewnew.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import id.ajeng.recycleviewnew.Activity.DetailProdukActivity
import id.ajeng.recycleviewnew.Activity.DetailResepActivity
import id.ajeng.recycleviewnew.R

class ResepAdapter  : RecyclerView.Adapter<ResepAdapter.ViewHolder>() {

    private val listResep = arrayOf( "Choi Pan", "Bacem Ayam", "PokCoy Siram Cincang Jamur", "Lapis Pandan Sagu")
    private val descResep = arrayOf( "Rasa bengkuang yang harum dipadukan dengan ebi kering yang nikmat membuat makanan khas Pontianak ini digemari oleh banyak orang", "Engga cuma tempe dan tahun aja loh yang enak dibacem. Resep bacem juga tambah nikmat jika bahan utamanya diubah menjadi ayam. Dicoba yuk resep Bacem Ayamnya!", "Sayur pakcoy yang disiram dengan bumbu jamur. Mudah dan ekonomis untuk dibuat di rumah, bakal bikin puas banget!", "Lapis Pandan Sagu merupakan makanan asal Betawi")
    private val stepResep = arrayOf(
        "-3 buah bengkuang ukuran sedang\n"
        + "-3 sdm ebi kering\n"
        + "-2 siung bawang putih\n"
                +"-1/2 sdt merica\n"
                +"-100gr tepung beras\n"
                +"-40gr tepung tapioka\n"
                +"-1 sdm minyak goreng\n"
                +"-320ml air\n"
                +"-10 cabe keriting merah\n"
                +"-8 cabe rawit\n"
                +"-1 siung bawang putih\n"
                +"-2 sdm cuka masak\n"
                +"-2 sdm gula pasir\n"
                +"-8 siung bawang putih\n",
        "1 kg ayam potong 8\n"
                +"-500 ml air kelapa/biasa\n"
                +"-2 bulatan gula merah\n"
                +"-3 lembar daun salam\n"
                +"-1 ruas lengkuas\n"
                +"-1  sdm garam\n"
                +"-5 siung bawang merah\n"
                +"-4 siung bawang putih\n"
                +"-1 jempol jahe \n"
                +"-Kunyit sediki\n"
                +"-1 sdt ketumbar\n",
        "-250 gr Pakcoy\n"
                +"- 125 gr daging sapi cincang              \n"
                +"- 100 gr jamur champignon                 \n"
                +"- 1 butir bawang bombay                   \n"
                +"- 2 siung bawang putih                    \n"
                +"- 2 SDM Saus Tiram                        \n"
                +"- 1 SDM kecap manis                       \n"
                +"- 1 SDM kecap asin                        \n"
                +"- Garam secukupnya                        \n"
                +"- Kaldu bubuk secukupnya                  \n"
                +"- Air matang                              \n"
                +"-1 SDM maizena larutkan dengan sedikit air\n",
        "-250 gr Pakcoy\n"
                +"- 125 gr daging sapi cincang              \n"
                +"- 100 gr jamur champignon                 \n"
                +"- 1 butir bawang bombay                   \n"
                +"- 2 siung bawang putih                    \n"
                +"- 2 SDM Saus Tiram                        \n"
                +"- 1 SDM kecap manis                       \n"
                +"- 1 SDM kecap asin                        \n"
                +"- Garam secukupnya                        \n"
                +"- Kaldu bubuk secukupnya                  \n"
                +"- Air matang                              \n"
                +"-1 SDM maizena larutkan dengan sedikit air\n")

    private val imageResep = arrayOf(R.drawable.choipan, R.drawable.ayambacem, R.drawable.pakcoy, R.drawable.lapisps)

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
        // holder.deskripsiResep.text = deskripsiResep[position]
        holder.imageResep.setImageResource(imageResep[position])

        holder.imageResep.setOnClickListener{
            val context = holder.imageResep.context
            val intent = Intent( context, DetailResepActivity::class.java)

            intent.putExtra("Resep", listResep!![position])
            intent.putExtra("Gambar", imageResep!![position])
            intent.putExtra("Deskripsi", descResep!![position])
            intent.putExtra("Langkah", stepResep!![position])

            context.startActivity(intent)
        }
    }
}
