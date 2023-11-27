package com.example.app_cekkesehatan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DaftarAkunActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_akun)

        val buttonDaftar: Button = findViewById(R.id.buttonDaftar)

        buttonDaftar.setOnClickListener(View.OnClickListener {
            // Intent untuk mengarahkan ke halaman utama (MainActivity)
            val intent = Intent(this@DaftarAkunActivity, MainActivity::class.java)
            startActivity(intent)
        })
    }
}
