package com.example.tugas_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pertama.setOnClickListener {
            startActivity(Intent(this,profile::class.java))
        }
        kedua.setOnClickListener {
            startActivity(Intent(this,datadiri::class.java))
        }
        ketiga.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.github.com/Musnadil"))
            startActivity(intent)
        }
        keempat.setOnClickListener {
            finish()
        }
    }
}