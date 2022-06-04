package id.ajeng.recycleviewnew.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import id.ajeng.recycleviewnew.R
import org.w3c.dom.Text

class DetailProdukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_produk)

        val productName : TextView = findViewById(R.id.productTitle)
        val productPrice : TextView = findViewById(R.id.productPrice)
        val productImage : ImageView = findViewById(R.id.imageProductDetail)

        val bundle : Bundle?= intent.extras
        val name = bundle!!.getString("Nama")
        val price = bundle!!.getString("Price")
        val imageId = bundle!!.getInt("imageId")

        productName.text = name
        productPrice.text = price
        productImage.setImageResource(imageId)
    }
}