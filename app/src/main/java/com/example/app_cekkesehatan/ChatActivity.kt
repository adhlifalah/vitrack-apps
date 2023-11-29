package com.example.app_cekkesehatan

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ChatActivity : AppCompatActivity() {

    private lateinit var etMessage: EditText
    private lateinit var btnSend: Button
    private lateinit var tvSentMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        etMessage = findViewById(R.id.etMessage)
        btnSend = findViewById(R.id.btnSend)
        tvSentMessage = findViewById(R.id.tvSentMessage)

        btnSend.setOnClickListener {
            sendMessage()
        }
    }

    private fun sendMessage() {
        val message = etMessage.text.toString()

        // You can replace this with your own logic for sending messages
        // For now, just display a Toast with the message content
        if (message.isNotBlank()) {
            // Show the sent message in the chat container
            showSentMessage(message)
            etMessage.text.clear()
        } else {
            showToast("Please enter a message.")
        }
    }

    private fun showSentMessage(message: String) {
        // Set the sent message text
        tvSentMessage.text = message

        // Make the sent message TextView visible
        tvSentMessage.visibility = View.VISIBLE
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
