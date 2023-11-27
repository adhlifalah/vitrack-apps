package com.example.app_cekkesehatan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LupaPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa_password)

        val buttonKirim: Button = findViewById(R.id.buttonKirim)

        buttonKirim.setOnClickListener(View.OnClickListener {
            // Intent untuk mengarahkan ke MainActivity
            val intent = Intent(this@LupaPasswordActivity, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional: menutup activity saat ini agar tidak dapat kembali ke halaman lupa password
        })
    }
}
