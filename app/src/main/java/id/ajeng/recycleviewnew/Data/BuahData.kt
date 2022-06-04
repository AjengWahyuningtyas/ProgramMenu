package id.ajeng.recycleviewnew

import id.ajeng.recycleviewnew.Model.Buah

object BuahData {

    private val buahNames = arrayOf(
        "Nanas Palembang",
        "Apel Washington",
        "Buah Naga",
        "Lemon Lokal",
        "Melon",
        "Semangka",
        "Pisang Cavendish",
        "Jambu Crystal AB"
    )

    private val satuan = arrayOf(
        "pack",
        "pcs",
        "kg",
        "gr"
    )

    private val buahHarga = arrayOf(
        "Rp 10.500/" + satuan[0],
        "Rp 24.900/" + satuan[1],
        "Rp 28.900/800-1000" + satuan[3],
        "Rp 18.500/" + satuan[2],
        "Rp 38.900/1800-2300" + satuan[3],
        "Rp 42.500/4000-5000" + satuan[3],
        "Rp 23.900/" + satuan[2],
        "Rp 25.900/" + satuan[2],
    )

    private val buahPhoto = intArrayOf(
        R.drawable.nanas,
        R.drawable.apel,
        R.drawable.dragonfruit,
        R.drawable.lemon,
        R.drawable.melon,
        R.drawable.watermelon,
        R.drawable.banana,
        R.drawable.guava
    )

    val listData: ArrayList<Buah>
    get() {
        var list = arrayListOf<Buah>()
            for (position in buahNames.indices){
                val buah = Buah()
                buah.name = buahNames[position]
                //buah.deskripsi = buahDeskripsi[position]
                buah.harga = buahHarga[position]
                buah.photo = buahPhoto[position]
                list.add(buah)
            }
            return list
    }
}