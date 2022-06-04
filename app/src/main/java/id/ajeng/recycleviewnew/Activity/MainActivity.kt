package id.ajeng.recycleviewnew.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import id.ajeng.recycleviewnew.*
import id.ajeng.recycleviewnew.Adapter.BuahAdapter
import id.ajeng.recycleviewnew.Data.BuahData
import id.ajeng.recycleviewnew.Model.Buah
import id.ajeng.recycleviewnew.Model.BuahViewsModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment= FirstFragment()
        val secondFragment= SecondFragment()
        val thirdFragment= ThirdFragment()
        val fourthFragment= FourthFragment()
        val fifthFragment= FifthFragment()

        setCurrentFragment(firstFragment)


        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                //R.id.home->setCurrentFragment(firstFragment)
                R.id.home -> setCurrentFragment(firstFragment) ;
                R.id.person ->setCurrentFragment(secondFragment)
                R.id.settings ->setCurrentFragment(thirdFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}