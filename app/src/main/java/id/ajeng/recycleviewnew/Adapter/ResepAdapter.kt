package id.ajeng.recycleviewnew.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.ajeng.recycleviewnew.Activity.DetailResepActivity
import id.ajeng.recycleviewnew.R

class ResepAdapter  : RecyclerView.Adapter<ResepAdapter.ViewHolder>() {

    private val listResep = arrayOf( "Choi Pan", "Bacem Ayam", "PokCoy Siram Cincang Jamur", "Lapis Pandan Sagu")
    private val descResep = arrayOf( "Rasa bengkuang yang harum dipadukan dengan ebi kering yang nikmat membuat makanan khas Pontianak ini digemari oleh banyak orang", "Engga cuma tempe dan tahun aja loh yang enak dibacem. Resep bacem juga tambah nikmat jika bahan utamanya diubah menjadi ayam. Dicoba yuk resep Bacem Ayamnya!", "Sayur pakcoy yang disiram dengan bumbu jamur. Mudah dan ekonomis untuk dibuat di rumah, bakal bikin puas banget!", "Lapis Pandan Sagu merupakan makanan asal Betawi")
    private val bahanResep = arrayOf(
        "- 3 buah bengkuang ukuran sedang\n"
                +"- 3 sdm ebi kering\n"
                +"- 2 siung bawang putih\n"
                +"- 1/2 sdt merica\n"
                +"- 100gr tepung beras\n"
                +"- 40gr tepung tapioka\n"
                +"- 1 sdm minyak goreng\n"
                +"- 320ml air\n"
                +"- 10 cabe keriting merah\n"
                +"- 8 cabe rawit\n"
                +"- 1 siung bawang putih\n"
                +"- 2 sdm cuka masak\n"
                +"- 2 sdm gula pasir\n"
                +"- 8 siung bawang putih\n",
        "- 1 kg ayam potong 8\n"
                +"- 500 ml air kelapa/biasa\n"
                +"- 2 bulatan gula merah\n"
                +"- 3 lembar daun salam\n"
                +"- 1 ruas lengkuas\n"
                +"- 1  sdm garam\n"
                +"- 5 siung bawang merah\n"
                +"- 4 siung bawang putih\n"
                +"- 1 jempol jahe \n"
                +"- Kunyit sediki\n"
                +"- 1 sdt ketumbar\n",
        "- 250 gr Pakcoy\n"
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
                +"- 1 SDM maizena larutkan dengan sedikit air\n",
        "- 250 gr Pakcoy\n"
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
                +"- 1 SDM maizena larutkan dengan sedikit air\n")

    private val stepResep = arrayOf(
        "Step 1  : Kupas dan cuci bengkuang lalu parut kasar.\n"
                +"Step 2  : Rendam ebi dengan air hangat dan cincang bawang putih.\n"
                +"Step 3  : Rendam ebi dengan air hangat dan cincang bawang putih.\n"
                +"Step 4  : Dalam wadah campurkan semua bahan kulit aduk rata                                                        \n"
                +"Step 5  : Masak dengan api kecil hingga adonan menggumpal.                                                         \n"
                +"Step 6  : Pindahkan pada alas yg sudah ditaburi tepung tapioka.                                                    \n"
                +"Step 7  : Ambil sedikit adonan pipihkan lalu isi dengan bengkuang tadi lalu lipat rekatkan.                        \n"
                +"Step 8  : Alasi kukusan dengan daun pisang yg sudah diolesi minyak goreng lalu kukus coipan 6-7menit hingga matang.\n"
                +"Step 9  : Untuk saus blender semua bahan cuka merah lalu masak hingga tingkat kematangan yg diinginkan.            \n"
                +"Step 10 : Untuk minyak bawang, cincang bawang putih lalu tumis hingga kecoklatan.                                 \n"
                +"Step 11 : Untuk minyak bawang, cincang bawang putih lalu tumis hingga kecoklatan.                                 \n",
        "Step 1 : Haluskan bumbu halus sisihkan.                                            \n"
                +"Step 2 : Dalam wajan masukan air, gula merah, daun salam dan lengkuas nyalakan api.\n"
                +"Step 3 : Tuang bumbu halus.                                                        \n"
                +"Step 4 : Masukan 5 sdm kecap manis.                                                \n"
                +"Step 5 : Masukan ayam potong.                                                      \n"
                +"Step 6 : Masak biarkan air menyusut.                                               \n"
                +"Step 7 : Setelah menyusut Goreng ayam sampai kulit ayam golden brown               \n"
                +"Step 8 : Setelah menyusut Goreng ayam sampai kulit ayam golden brown               \n",
        "Step 1: Cuci bersih Pakcoy biarkan utuh. Didihkan air lalu rebus Pakcoy tambahkan 1 SDT garam. \\n\n" +
                "                        Rebus sebentar, angkat. Tata di piring saji.\n"
                +"Step 2 : Cuci dan potong-potong jamur champignon, bawang bombay serta bawang putih.         \n"
                +"Step 3 : Tumis bawang bombay dan bawang putih sampai harum dan matang                       \n"
                +"Step 4 : Masukkan daging cincang,masak hingga daging berubah warna.                         \n"
                +"Step 5 : Selanjutnya masukkan jamur, aduk-aduk                                              \n"
                +"Step 6 : Masukkan air, Saus Tiram, kecap manis, kecap asin, garam dan kaldu bubuk. Cek rasa.\n"
                +"Step 7 : Tambahkan larutan tepung maizena, aduk rata                                        \n"
                +"Step 8 : Tuang bumbu siram diatas sayur pakcoy yang telah di tata diatas piring             \n"
                +"Step 9 : Siap disajikan                                                                     \n")

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
        holder.listResep.text = listResep[position]
        holder.imageResep.setImageResource(imageResep[position])

        holder.imageResep.setOnClickListener{
            val context = holder.imageResep.context
            val intent = Intent( context, DetailResepActivity::class.java)

            intent.putExtra("Resep", listResep!![position])
            intent.putExtra("Gambar", imageResep!![position])
            intent.putExtra("Deskripsi", descResep!![position])
            intent.putExtra("Bahan", bahanResep!![position])
            intent.putExtra("Langkah", stepResep!![position])

            context.startActivity(intent)
        }
    }
}
