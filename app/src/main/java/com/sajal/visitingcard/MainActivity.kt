package com.sajal.visitingcard

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var phoneEditText: EditText
    private lateinit var generateCardButton: Button
    private lateinit var cardTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.nameEditText)
        emailEditText = findViewById(R.id.EmailEditText)
        phoneEditText = findViewById(R.id.PhoneEditText)
        generateCardButton = findViewById(R.id.GenerateCardButton)
        cardTextView = findViewById(R.id.CardTextView)

        generateCardButton.setOnClickListener {
            generateVisitingCard()
        }
    }

    private fun generateVisitingCard() {
        val name = nameEditText.text.toString()
        val email = emailEditText.text.toString()
        val phone = phoneEditText.text.toString()

        val visitingCard = "Name: $name\nEmail: $email\nPhone: $phone"
        cardTextView.text = visitingCard
        cardTextView.visibility = View.VISIBLE
    }
}
