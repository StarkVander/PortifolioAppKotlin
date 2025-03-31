package com.example.portifolioapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class HabilidadesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Desativar a ActionBar
        supportActionBar?.hide()

        setContentView(R.layout.activity_habilidades)

        // Botão Home
        val buttonHome = findViewById<Button>(R.id.btnHome)
        buttonHome.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}