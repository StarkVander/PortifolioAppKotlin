package com.example.portifolioapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Desativar a ActionBar
        supportActionBar?.hide()

        setContentView(R.layout.activity_main)

        // Botão Habilidades
        val buttonHabilidades = findViewById<Button>(R.id.btnHabilidades)
        buttonHabilidades.setOnClickListener {
            val intent = Intent(this, HabilidadesActivity::class.java)
            startActivity(intent)
        }

        // Botão Formação
        val buttonFormacao = findViewById<Button>(R.id.btnFormacao)
        buttonFormacao.setOnClickListener {
            val intent = Intent(this, FormacaoActivity::class.java)
            startActivity(intent)
        }

        // Botão Contatos
        val buttonContatos = findViewById<Button>(R.id.btnContatos)
        buttonContatos.setOnClickListener {
            val intent = Intent(this, ContatoActivity::class.java)
            startActivity(intent)
        }

        // Botão Projetos
        val buttonProjetos = findViewById<Button>(R.id.btnProjetos)
        buttonProjetos.setOnClickListener {
            val intent = Intent(this, ProjetoActivity::class.java)
            startActivity(intent)
        }
    }
}