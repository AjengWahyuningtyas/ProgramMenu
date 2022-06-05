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

    private val listBuah = arrayOf("Buah Naga", "Buah Melon", "Buah Semangka", "Buah Apel")
    private val listImageBuah = arrayOf(R.drawable.dragonfruit, R.drawable.melon, R.drawable.watermelon, R.drawable.apel)
    private val satuan = arrayOf(
        "pack",
        "pcs",
        "kg",
        "gr"
    )

    private val harga = arrayOf(
        "Rp 22.900/" + satuan[3],
        "Rp 24.900/" + satuan[1],
        "Rp 54.500" + satuan[3],
        "Rp 18.500/" + satuan[2],
    )

    private val desc = arrayOf(
        "Buah Naga 800 - 1000gr ( 2-3 pcs ) Buah naga memiliki kulit yang tampak bersisik dan berwarna merah keunguan atau merah muda. Buah naga termasuk kedalam buah rendah kalori, tidak mengandung lemak dan memiliki kandungan gizi yang tinggi. Manfaat buah naga dapat membantu mengurangi jerawat, melawan diabetes, sumber magnesium yang baik, mengatasi kerusakan rambut.\n"
                + "> Isi kurang lebih 2 - 3 Pcs (tergantung ukuran dan ketersediaan yang ada)\n"
                + "> Berat kurang lebih 800gr - 1000gr\n"
                + "Harga dapat berubah sewaktu-waktu\n",

        "Melon 1800gr - 2300gr\n"
                + "Melon ini memiliki rasa manis dan tekstur lembut. Daging buahnya berwarna hijau muda, rasanya manis, dan teksturnya kenyal.\n"
                + "Berikut adalah kandungan nutrisi yang terdapat dalam melon serta manfaatnya bagi kesehatan:\n"
                + "- Meningkatkan Sistem Kekebalan Tubuh\n"
                + "- Mencegah Naiknya Tekanan Darah\n"
                + "- Melancarkan Sistem Pencernaan\n"
                + "- Baik untuk Wanita Hamil, Kandungan asam folat melon yang tinggi mencegah timbulnya kerusakan pembentukan syaraf yang sering terjadi pada ibu hamil. Disarankan untuk mengonsumsi melon sebanyak 100 gram per harinya untuk membantu melahirkan anak yang sehat.\n"
                + "- Harga berubah sewaktu-waktu \n",

        "Semangka 1pcs berat 4000gr - 5000gr\n"
                + "Gramasi bisa berubah tergantung ketersediaan stok yang ada\n"
                + "Semangka merah tanpa biji\n"
                + "Harga dapat berubah sewaktu-waktu\n"
                + "Spec/jenis bisa berubah tergantung musim\n",

        "Apel Washington memiliki ciri berkulit merah gelap dengan tekstur kulit agak tebal dan memiliki rasa manis. Manfaat apel ini dapat memberikan nutrisi pada kulit, mengurangi potensi penyakit alzheimer, mencegah gangguan hati dan pencernaan."
                + "Sebaiknya disimpan di dalam suhu ruangan atau lemari pendingin agar dapat menjaga kesegaran dan lebih nikmat saat dimakan.\n"
                + "Harga dapat berubah sewaktu-waktu"
    )


    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // val imageView: ImageView = itemView.findViewById(R.id.imageProductDetail)
        // val textView: TextView = itemView.findViewById(R.id.productTitle)
        var listBuah: TextView
        var listImageBuah: ImageView
        //var desc: TextView
        var harga: TextView

        init {
            listBuah = itemView.findViewById(R.id.namaBuah)
            listImageBuah = itemView.findViewById(R.id.imageBuah)
            //desc= itemView.findViewById(R.id.descriptionProductDetailContent)
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
        // holder.desc.text = desc[position]
        holder.listImageBuah.setImageResource(listImageBuah[position])

        holder.listImageBuah.setOnClickListener{
            val context = holder.listImageBuah.context
            val intent = Intent( context, DetailProdukActivity::class.java)

            intent.putExtra("Produk", listBuah!![position])
            intent.putExtra("Detail", desc!![position])
            intent.putExtra("Harga", harga!![position])
            intent.putExtra("Gambar", listImageBuah!![position])

            context.startActivity(intent)
        }
    }
}
