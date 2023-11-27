package com.example.app_cekkesehatan

// MCUActivity.kt

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

// MCUActivity.kt

class MCUActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var edtName: EditText
    private lateinit var edtAge: EditText
    private lateinit var edtWeight: EditText
    private lateinit var edtHeight: EditText
    private lateinit var edtBloodSugar: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mcu)

        sharedPreferences = getSharedPreferences("MCU_PREFERENCES", Context.MODE_PRIVATE)

        edtName = findViewById(R.id.edtName)
        edtAge = findViewById(R.id.edtAge)
        edtWeight = findViewById(R.id.edtWeight)
        edtHeight = findViewById(R.id.edtHeight)
        edtBloodSugar = findViewById(R.id.edtBloodSugar)

        val btnSubmitMCU: Button = findViewById(R.id.btnSubmitMCU)
        btnSubmitMCU.setOnClickListener {
            saveData()
        }
    }

    private fun saveData() {
        val name = edtName.text.toString()
        val age = edtAge.text.toString()
        val weight = edtWeight.text.toString()
        val height = edtHeight.text.toString()
        val bloodSugar = edtBloodSugar.text.toString()

        // Simpan data menggunakan SharedPreferences
        val editor = sharedPreferences.edit()
        editor.putString("NAME", name)
        editor.putString("AGE", age)
        editor.putString("WEIGHT", weight)
        editor.putString("HEIGHT", height)
        editor.putString("BLOOD_SUGAR", bloodSugar)
        editor.apply()

        // Setelah menyimpan data, kita dapat mereset input fields
        edtName.text.clear()
        edtAge.text.clear()
        edtWeight.text.clear()
        edtHeight.text.clear()
        edtBloodSugar.text.clear()
    }
}



