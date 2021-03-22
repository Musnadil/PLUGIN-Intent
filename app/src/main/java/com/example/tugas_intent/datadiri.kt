package com.example.tugas_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_datadiri.*

class datadiri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datadiri)
        submit.setOnClickListener {
            val depan = et_depan.text.toString()
            val belakang = et_belakang.text.toString()
            Intent(this,output::class.java). also {
                it.putExtra("nama_depan",depan)
                it.putExtra("nama_belakang",belakang)
                startActivity(it)
            }
        }
    }
}
