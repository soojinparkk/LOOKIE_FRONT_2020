package com.example.intentproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ABtn.setOnClickListener {
            val intent1 = Intent(this@MainActivity, AActivity :: class.java)
            startActivity(intent1)
        }

        BBtn.setOnClickListener {
            val intent2 = Intent(this@MainActivity, BActivity :: class.java)
            startActivity(intent2)
        }

        CBtn.setOnClickListener {
            val intent3 = Intent(this@MainActivity, CActivity :: class.java)
            startActivity(intent3)
        }
    }
}
