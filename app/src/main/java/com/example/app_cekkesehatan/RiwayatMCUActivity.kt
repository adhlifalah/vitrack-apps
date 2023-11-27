package com.example.app_cekkesehatan

// RiwayatMCUActivity.kt

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// RiwayatMCUActivity.kt

class RiwayatMCUActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var txtData: TextView
    private lateinit var txtName: TextView
    private lateinit var txtAge: TextView
    private lateinit var txtWeight: TextView
    private lateinit var txtHeight: TextView
    private lateinit var txtBloodSugar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_mcu)

        sharedPreferences = getSharedPreferences("MCU_PREFERENCES", Context.MODE_PRIVATE)

        txtData = findViewById(R.id.txtData)
        txtName = findViewById(R.id.txtName)
        txtAge = findViewById(R.id.txtAge)
        txtWeight = findViewById(R.id.txtWeight)
        txtHeight = findViewById(R.id.txtHeight)
        txtBloodSugar = findViewById(R.id.txtBloodSugar)

        loadData()
    }

    private fun loadData() {
        val name = sharedPreferences.getString("NAME", "")
        val age = sharedPreferences.getString("AGE", "")
        val weight = sharedPreferences.getString("WEIGHT", "")
        val height = sharedPreferences.getString("HEIGHT", "")
        val bloodSugar = sharedPreferences.getString("BLOOD_SUGAR", "")

        // Tampilkan data di TextView
        txtName.text = "Name: $name"
        txtAge.text = "Age: $age"
        txtWeight.text = "Weight: $weight"
        txtHeight.text = "Height: $height"
        txtBloodSugar.text = "Blood Sugar: $bloodSugar"
    }
}


