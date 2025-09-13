package com.example.spotlyapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var tvAppName: TextView
    private lateinit var imgProfile: ImageView
    private lateinit var tvWelcome: TextView

    private lateinit var btnMusic: MaterialButton
    private lateinit var btnTheater: MaterialButton
    private lateinit var btnFood: MaterialButton
    private lateinit var btnTech: MaterialButton


    private lateinit var tvHighlights: TextView
    private lateinit var cardHighlight: MaterialCardView
    private lateinit var imgHighlight: ImageView

    private lateinit var tvRecommended: TextView
    private lateinit var cardRecommended: MaterialCardView
    private lateinit var imgRecommended: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val tvAppName: TextView = findViewById(R.id.tvAppName)
        val imgProfile: ImageView = findViewById(R.id.imgProfile)


        val tvWelcome: TextView = findViewById(R.id.tvWelcome)


        val btnMusic: MaterialButton = findViewById(R.id.btnMusic)
        val btnTheater: MaterialButton = findViewById(R.id.btnTheater)
        val btnFood: MaterialButton = findViewById(R.id.btnFood)
        val btnTech: MaterialButton = findViewById(R.id.btnTech)


        val tvHighlights: TextView = findViewById(R.id.tvHighlights)
        val cardHighlight: MaterialCardView = findViewById(R.id.cardHighlight)
        val imgHighlight: ImageView = findViewById(R.id.imgHighlight)


        val tvRecommended: TextView = findViewById(R.id.tvRecommended)
        val cardRecommended: MaterialCardView = findViewById(R.id.cardRecommended)
        val imgRecommended: ImageView = findViewById(R.id.imgRecommended)




        imgProfile.setOnClickListener {

        }

        btnMusic.setOnClickListener {

        }

        btnTheater.setOnClickListener {

        }

        btnFood.setOnClickListener {

        }

        btnTech.setOnClickListener {

        }

        cardHighlight.setOnClickListener {

        }

        cardRecommended.setOnClickListener {

        }

    }
}
