package id.ajeng.recycleviewnew.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import id.ajeng.recycleviewnew.R

class DetailResepActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_resep)

        val recipeName : TextView = findViewById(R.id.namaRecipe)
        val recipeImage : ImageView = findViewById(R.id.imageDetailRecipe)

        val bundle : Bundle?= intent.extras
        val name = bundle!!.getString("Resep")
        val imageId = bundle!!.getInt("Gambar")

        recipeName.text = name
        recipeImage.setImageResource(imageId)
    }
}