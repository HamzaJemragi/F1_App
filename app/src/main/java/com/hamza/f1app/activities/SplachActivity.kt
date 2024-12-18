package com.hamza.f1app.activities

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hamza.f1app.R
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView


class SplachActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splach)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.splachActivity)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar?.hide()
        val f1Logo=findViewById<ImageView>(R.id.f1Logo)
        f1Logo.visibility= View.INVISIBLE

        Handler(Looper.getMainLooper()).postDelayed({
            val animFadeIn= AnimationUtils.loadAnimation(this,R.anim.fade_in)
            f1Logo.visibility= View.VISIBLE
            f1Logo.startAnimation(animFadeIn)

            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, SecondActivity::class.java)
                val options = android.app.ActivityOptions.makeCustomAnimation(
                    this,
                    R.anim.slide_in_right,
                    R.anim.slide_out_left
                )
                startActivity(intent, options.toBundle())
            }, 3000)
        },500)


    }
}