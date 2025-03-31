package com.example.portifolioapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ContatoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_contato)

        // Botão LinkedIn
        val buttonLinkedIn = findViewById<Button>(R.id.btnLinkedIn)
        buttonLinkedIn.setOnClickListener {
            val url = "https://www.linkedin.com/in/byvanderviana/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // Botão GitHub
        val buttonGitHub = findViewById<Button>(R.id.btnGitHub)
        buttonGitHub.setOnClickListener {
            val url = "https://github.com/StarkVander"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // Botão Home
        val buttonHome = findViewById<Button>(R.id.btnHome)
        buttonHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}