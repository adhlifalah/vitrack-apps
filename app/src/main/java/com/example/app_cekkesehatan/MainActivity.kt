package com.example.app_cekkesehatan

// MainActivity.kt
import android.content.Context
import android.widget.Button
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = getSharedPreferences("MCU_PREFERENCES", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()

        val btnMCU = findViewById<Button>(R.id.btnDaftar)
        btnMCU.setOnClickListener {
            val intent = Intent(this, MCUActivity::class.java)
            startActivity(intent)
        }

        // Tombol Riwayat
        findViewById<View>(R.id.btnRiwayat).setOnClickListener {
            openRiwayatActivity()
        }

        findViewById<View>(R.id.btnKonsultasi).setOnClickListener {
            val intent = Intent(this, KonsultasiActivity::class.java)
            startActivity(intent)
        }
    }

    // Metode untuk membuka RiwayatMCUActivity
    fun openRiwayatActivity() {
        val intent = Intent(this, RiwayatMCUActivity::class.java)
        startActivity(intent)
    }
}

