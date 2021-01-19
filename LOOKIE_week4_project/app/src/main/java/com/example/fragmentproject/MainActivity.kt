package com.example.fragmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 : FragmentOne = FragmentOne()
        val fragment2 : FragmentTwo = FragmentTwo()
        val fragment3 : FragmentThree = FragmentThree()
        val fragment4 : FragmentFour = FragmentFour()

        btn1.setOnClickListener {
            val fragmentManager : FragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment1)
            fragmentTransaction.commit()
        }

        btn2.setOnClickListener {
            val fragmentManager : FragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment2)
            fragmentTransaction.commit()
        }

        btn3.setOnClickListener {
            val fragmentManager : FragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment3)
            fragmentTransaction.commit()
        }

        btn4.setOnClickListener {
            val fragmentManager : FragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment4)
            fragmentTransaction.commit()
        }
    }
}
