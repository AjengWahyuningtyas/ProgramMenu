package id.ajeng.recycleviewnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMakanan: RecyclerView
    private val list = ArrayList<Makanan>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMakanan = findViewById(R.id.rv_makanan)
        rvMakanan.setHasFixedSize(true)

        list.addAll(MakananData.listData)
        showRecyclerView()
    }

    private fun showRecyclerView() {
        rvMakanan.layoutManager= LinearLayoutManager( this)
        val lisMakananAdapter = MakananAdapter.MakananAdapter(list)
        rvMakanan.adapter = lisMakananAdapter
    }
}