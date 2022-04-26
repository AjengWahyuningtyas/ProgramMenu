package id.ajeng.recycleviewnew

object MakananData {

    private val makananNames = arrayOf(
        "Rendang",
        "Bakso",
        "Sate",
        "Nasi Padang",
        "Nasi Goreng",
        "Rawon",
        "Gado-Gado",
        "Martabak Manis",
        "Tempe Mendoan"
    )

    private val makananDeskripsi = arrayOf(
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

    private val makananPhoto = intArrayOf(
        R.drawable.rendang,
        R.drawable.bakso,
        R.drawable.sate,
        R.drawable.padang,
        R.drawable.nasigoreng,
        R.drawable.rawon,
        R.drawable.gado,
        R.drawable.martabakmanis,
        R.drawable.tempe
    )

    val listData: ArrayList<Makanan>
    get() {
        var list = arrayListOf<Makanan>()
            for (position in makananNames.indices){
                val makanan = Makanan()
                makanan.name = makananNames[position]
                makanan.deskripsi = makananDeskripsi[position]
                makanan.photo = makananPhoto[position]
                list.add(makanan)
            }
            return list
    }
}