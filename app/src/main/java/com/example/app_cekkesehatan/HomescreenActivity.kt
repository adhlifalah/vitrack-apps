package com.example.app_cekkesehatan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity

class HomescreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)

        val searchView: SearchView = findViewById(R.id.searchView)
        val imageView: ImageView = findViewById(R.id.imageView)
        val btnDaftar: Button = findViewById(R.id.btnDaftar)
        val btnRiwayat: Button = findViewById(R.id.btnRiwayat)
        val btnKonsultasi: Button = findViewById(R.id.btnKonsultasi)

        // Handle search functionality if needed
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Handle search submission
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // Handle search text change
                return false
            }
        })

        btnDaftar.setOnClickListener(View.OnClickListener {
            // Tambahkan logika Anda untuk menangani klik tombol 'Daftar'
        })

        btnRiwayat.setOnClickListener(View.OnClickListener {
            // Tambahkan logika Anda untuk menangani klik tombol 'Riwayat'
            openRiwayatActivity()
        })

        btnKonsultasi.setOnClickListener(View.OnClickListener {
            // Tambahkan logika Anda untuk menangani klik tombol 'Konsultasi'
        })
    }

    // Fungsi untuk membuka RiwayatActivity
    private fun openRiwayatActivity() {
        // Intent untuk mengarahkan ke halaman baru untuk riwayat
        // Gantilah "RiwayatActivity" dengan nama activity yang sesuai
        val intent = Intent(this@HomescreenActivity, RiwayatMCUActivity::class.java)
        startActivity(intent)
    }
}