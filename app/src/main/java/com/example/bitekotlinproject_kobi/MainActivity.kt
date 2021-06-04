package com.example.bitekotlinproject_kobi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nazrulBtn.setOnClickListener {
            val intent=Intent(this,ProfileActivity::class.java)
            intent.putExtra("name",nazrulBtn.text.toString())
            startActivity(intent)

        }
        rabindraBtn.setOnClickListener {
            val intent=Intent(this,ProfileActivity::class.java)
            intent.putExtra("name",rabindraBtn.text.toString())
            startActivity(intent)

        }
        humayunBtn.setOnClickListener {
            val intent=Intent(this,ProfileActivity::class.java)
            intent.putExtra("name",humayunBtn.text.toString())
            startActivity(intent)

        }
        sufiaBtn.setOnClickListener {
            val intent=Intent(this,ProfileActivity::class.java)
            intent.putExtra("name",sufiaBtn.text.toString())
            startActivity(intent)

        }
        sukumarBtn.setOnClickListener {
            val intent=Intent(this,ProfileActivity::class.java)
            intent.putExtra("name",sukumarBtn.text.toString())
            startActivity(intent)

        }
        johirBtn.setOnClickListener {
            val intent=Intent(this,ProfileActivity::class.java)
            intent.putExtra("name",johirBtn.text.toString())
            startActivity(intent)

        }
        bolaichadBtn.setOnClickListener {
            val intent=Intent(this,ProfileActivity::class.java)
            intent.putExtra("name",bolaichadBtn.text.toString())
            startActivity(intent)

        }
    }
}