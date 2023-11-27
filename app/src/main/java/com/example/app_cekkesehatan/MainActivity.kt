package com.example.app_cekkesehatan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMasuk: Button = findViewById(R.id.buttonMasuk)
        val sinkronAkun: TextView = findViewById(R.id.sinkronAkun)
        val daftarAkun: TextView = findViewById(R.id.daftarAkun)
        val lupaPassword: TextView = findViewById(R.id.lupaPassword)

        buttonMasuk.setOnClickListener(View.OnClickListener {
            // Intent untuk mengarahkan ke halaman baru, gantilah "HalamanBaruActivity" dengan nama activity yang sesuai
            val intent = Intent(this@MainActivity, HomescreenActivity::class.java)
            startActivity(intent)
        })

        sinkronAkun.setOnClickListener(View.OnClickListener {
            // Intent untuk mengarahkan ke halaman baru untuk sinkron akun
            val intent = Intent(this@MainActivity, SinkronAkunActivity::class.java)
            startActivity(intent)
        })

        daftarAkun.setOnClickListener(View.OnClickListener {
            // Intent untuk mengarahkan ke halaman baru untuk daftar akun
            val intent = Intent(this@MainActivity, DaftarAkunActivity::class.java)
            startActivity(intent)
        })

        lupaPassword.setOnClickListener(View.OnClickListener {
            // Intent untuk mengarahkan ke halaman baru untuk lupa password
            val intent = Intent(this@MainActivity, LupaPasswordActivity::class.java)
            startActivity(intent)
        })
    }
}