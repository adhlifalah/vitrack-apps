package com.example.app_cekkesehatan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class SinkronAkunActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sinkron_akun)

        val sinkronAkun: TextView = findViewById(R.id.sinkronAkun)
        val infoSinkronAkun: TextView = findViewById(R.id.infoSinkronAkun)
        val logoVitrack: ImageView = findViewById(R.id.logoVitrack)
        val editInputUname: EditText = findViewById(R.id.editInputUname)
        val editInputDate: EditText = findViewById(R.id.editInputDate)
        val editInputNumber: EditText = findViewById(R.id.editInputNumber)
        val editInputPass: EditText = findViewById(R.id.editInputPass)
        val editInputConfirmPass: EditText = findViewById(R.id.editInputConfirmPass)
        val buttonSinkron: Button = findViewById(R.id.buttonSinkron)

        // Tambahkan logika atau aksi yang diperlukan di sini, misalnya onClickListener untuk buttonSinkron

        buttonSinkron.setOnClickListener {
            // Intent untuk mengarahkan ke halaman utama, gantilah "MainActivity" dengan nama activity yang sesuai
            val intent = Intent(this@SinkronAkunActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
