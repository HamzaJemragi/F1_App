package com.hamza.f1app.activities

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.R
import com.hamza.f1app.adapters.RecyclerViewPastRaceResultAdapter
import com.hamza.f1app.data.resultats

class PastRaceResultActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        enableEdgeToEdge()
        setContentView(R.layout.past_race_result_activity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.resultActivity)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        window.statusBarColor = ContextCompat.getColor(this, R.color.f1red)
        val raceId = intent?.extras?.getInt("raceId")!!.toInt()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerViewPastRaceResultAdapter(resultats[raceId], this)
    }
}