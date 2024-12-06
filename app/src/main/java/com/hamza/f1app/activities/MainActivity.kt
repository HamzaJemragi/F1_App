package com.hamza.f1app.activities

import android.animation.ObjectAnimator
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hamza.f1app.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val introVideo = findViewById<VideoView>(R.id.introVideo)
        val main = findViewById<LinearLayout>(R.id.main)
        val racingCard = findViewById<CardView>(R.id.racingCard)
        val driversCard = findViewById<CardView>(R.id.driversCard)
        val constructorsCard = findViewById<CardView>(R.id.constructorsCard)
        val standingsCard = findViewById<CardView>(R.id.standingsCard)

        hide(racingCard)
        hide(driversCard)
        hide(constructorsCard)
        hide(standingsCard)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.f1red)
        }


//        val introVideoUri = Uri.parse("android.resource://${packageName}/raw/mclaren_intro")
//        introVideo.setVideoURI(introVideoUri)
//
//        introVideo.start()



//        introVideo.setOnCompletionListener {
//            introVideo.visibility = VideoView.GONE
//            main.visibility = LinearLayout.VISIBLE
            translater(racingCard, 1000)
            translater(driversCard, 1100)
            translater(constructorsCard, 1200)
            translater(standingsCard, 1300)

//        }
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