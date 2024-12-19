package com.hamza.f1app.activities

import android.animation.ObjectAnimator
import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.transition.Visibility
import com.hamza.f1app.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val main = findViewById<LinearLayout>(R.id.main)
        val racingCard = findViewById<CardView>(R.id.racingCard)
        val driversCard = findViewById<CardView>(R.id.driversCard)
        val constructorsCard = findViewById<CardView>(R.id.constructorsCard)
        val standingsCard = findViewById<CardView>(R.id.standingsCard)

//        Handler(Looper.getMainLooper()).postDelayed({
//            hide(racingCard)
//            hide(driversCard)
//            hide(constructorsCard)
//            hide(standingsCard)
//            main.visibility=LinearLayout.GONE
//        },500)

//        main.visibility = LinearLayout.VISIBLE
        window.statusBarColor = ContextCompat.getColor(this, R.color.f1red)




        translater(racingCard, 1000)
        translater(driversCard, 1100)
        translater(constructorsCard, 1200)
        translater(standingsCard, 1300)

    }

    private fun translater(card: CardView, duration: Long) {
        val animator = ObjectAnimator.ofFloat(card, View.TRANSLATION_X, 0f)
        animator.duration = duration
        animator.start()
    }

    private fun hide(card: CardView) {
        val animator = ObjectAnimator.ofFloat(card, View.TRANSLATION_X, 1500f)
        animator.repeatCount = 1
        animator.start()
    }
}