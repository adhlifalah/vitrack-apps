package com.example.app_cekkesehatan
// KonsultasiActivity.kt

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class KonsultasiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konsultasi)
    }

    fun onChatButtonClick(view: View) {
        val intent = Intent(this, ChatActivity::class.java)
        startActivity(intent)
    }

    fun onPhoneButtonClick(view: View) {
        // Tambahkan logika untuk tombol telepon
        val phoneNumber = "nomor_telepon_anda"
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
        startActivity(intent)
    }
}


