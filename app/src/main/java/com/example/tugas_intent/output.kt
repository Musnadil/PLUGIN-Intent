package com.example.tugas_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_intent.output
import kotlinx.android.synthetic.main.activity_output.*

class output : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)
        val depan = intent.getStringExtra("nama_depan")
        val belakang = intent.getStringExtra("nama_belakang")

        nama_depan.text=depan
        nama_belakang.text=belakang

    }
}