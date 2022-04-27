package id.ajeng.recycleviewnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var rvBuah: RecyclerView
    private val list = ArrayList<Buah>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBuah = findViewById(R.id.rv_makanan)
        rvBuah.setHasFixedSize(true)

        list.addAll(BuahData.listData)
        val firstFragment=FirstFragment()
        val secondFragment=SecondFragment()
        val thirdFragment=ThirdFragment()

        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                // R.id.home->setCurrentFragment(firstFragment)
                R.id.home->showRecyclerView();
                R.id.person->setCurrentFragment(secondFragment)
                R.id.settings->setCurrentFragment(thirdFragment)
            }
            true
        }
        // showRecyclerView()
    }

    private fun showRecyclerView() {
        rvBuah.layoutManager= GridLayoutManager( this, 2)
        val lisBuahAdapter = BuahAdapter.BuahAdapter(list)
        rvBuah.adapter = lisBuahAdapter
    }

    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}