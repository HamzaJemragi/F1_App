package com.hamza.f1app.activities

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hamza.f1app.R
import com.hamza.f1app.data.latest

class LatestinfoActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latestinfo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.latestActivity)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        window.statusBarColor = ContextCompat.getColor(this, R.color.f1red)
        val latestPosition = intent?.extras?.getInt("latestPosition")!!.toInt()

        val latestImage=findViewById<ImageView>(R.id.latestImage)
        val latestType=findViewById<TextView>(R.id.latestType)
        val latestDate=findViewById<TextView>(R.id.latestDate)
        val latestTitle=findViewById<TextView>(R.id.latestTitle)
        val latestContent=findViewById<TextView>(R.id.latestContent)

        latestImage.setImageResource(latest[latestPosition].newsImage)
        latestType.text=getString(latest[latestPosition].type)
        latestDate.text=latest[latestPosition].date
        latestTitle.text=getString(latest[latestPosition].title)
        latestContent.text=getString(latest[latestPosition].content)
        }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}