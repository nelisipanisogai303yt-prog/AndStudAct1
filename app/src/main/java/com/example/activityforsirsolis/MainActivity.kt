package com.example.activityforsirsolis

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pulangbtn = findViewById<Button>(R.id.buttonRed)
        val kahelbtn = findViewById<Button>(R.id.buttonOrange)
        val dilawbtn = findViewById<Button>(R.id.buttonYellow)
        val berdengbtn = findViewById<Button>(R.id.buttonGreen)
        val asulbtn = findViewById<Button>(R.id.buttonBlue)
        val biyoletangbtn = findViewById<Button>(R.id.buttonViolet)

        pulangbtn.setOnClickListener {
            Toast.makeText(this, "You clicked Red!", Toast.LENGTH_SHORT).show()
        }

        kahelbtn.setOnClickListener {
            Toast.makeText(this, "You clicked Orange!", Toast.LENGTH_SHORT).show()
        }

        dilawbtn.setOnClickListener {
            Toast.makeText(this, "You clicked Yellow!", Toast.LENGTH_SHORT).show()
        }

        berdengbtn.setOnClickListener {
            Toast.makeText(this, "You clicked Green!", Toast.LENGTH_SHORT).show()
        }

        asulbtn.setOnClickListener {
            Toast.makeText(this, "You clicked Blue!", Toast.LENGTH_SHORT).show()
        }

        biyoletangbtn.setOnClickListener {
            Toast.makeText(this, "You clicked Violet!", Toast.LENGTH_SHORT).show()
        }
    }
}