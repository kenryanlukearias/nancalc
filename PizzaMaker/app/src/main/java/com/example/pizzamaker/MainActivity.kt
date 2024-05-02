package com.example.pizzamaker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)




        val secondActivityBtn: Button = findViewById (R.id.Ingredients)

        secondActivityBtn.setOnClickListener() {
            val intent = Intent(this, IngredientsTab::class.java)
            startActivity(intent)
        }
    }
}
