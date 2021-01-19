package com.example.intentproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*

class BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        backBtnB.setOnClickListener {
            val intent1 = Intent(this@BActivity, MainActivity :: class.java)
            startActivity(intent1)
        }
    }
}
