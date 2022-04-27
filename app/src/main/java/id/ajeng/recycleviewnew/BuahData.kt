package id.ajeng.recycleviewnew

object MakananData {

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

    private val buahDeskripsi = arrayOf(
        "Meat (beef, lamb or goat), coconut milk, chilli, ginger, galangal, turmeric, lemongrass, garlic, shallot",
        "Ground beef, tapioca, noodle, rice vermicelli, beef broth, kailan, celery, salted vegetables, fried shallots",
        "Skewered and grilled meats with various sauces, mainly peanut sauce",
        "A miniature banquet of meats, fish, vegetables, and spicy sambals eaten with plain white rice",
        "Fried rice with pieces of meat and/or vegetables, and an assortment of seasonings such as sweet soy sauce",
        "Meat, keluak nut",
        "Various vegetables in peanut sauce topped with krupuk",
        "Flour, hot water, baking powder, bicarbonate soda, sugar, eggs, peanut, margarine, butter",
        "Tempe"
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

    val listData: ArrayList<Makanan>
    get() {
        var list = arrayListOf<Makanan>()
            for (position in buahNames.indices){
                val buah = Makanan()
                buah.name = buahNames[position]
                buah.deskripsi = buahDeskripsi[position]
                buah.photo = buahPhoto[position]
                list.add(buah)
            }
            return list
    }
}