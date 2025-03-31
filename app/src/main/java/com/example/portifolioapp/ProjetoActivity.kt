package com.example.portifolioapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProjetoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_projetos)

        // Botão Projeto 1
        val buttonProjeto1 = findViewById<Button>(R.id.btnProjeto1)
        buttonProjeto1.setOnClickListener {
            val url = ""
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // Botão Projeto 2
        val buttonProjeto2 = findViewById<Button>(R.id.btnProjeto2)
        buttonProjeto2.setOnClickListener {
            val url = ""
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // Botão Projeto 3
        val buttonProjeto3 = findViewById<Button>(R.id.btnProjeto3)
        buttonProjeto3.setOnClickListener {
            val url = ""
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