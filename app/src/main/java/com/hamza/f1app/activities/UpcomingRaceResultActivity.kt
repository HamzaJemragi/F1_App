package com.hamza.f1app.activities

import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hamza.f1app.Models.Race
import com.hamza.f1app.R
import com.hamza.f1app.data.races
import java.time.LocalDateTime
import java.time.Month
import java.time.temporal.ChronoUnit

class UpcomingRaceResultActivity: AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        enableEdgeToEdge()
        setContentView(R.layout.upcoming_race_result_activity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.resultActivity)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        window.statusBarColor = ContextCompat.getColor(this, R.color.f1red)
        val raceId = intent?.extras?.getInt("raceId")!!.toInt()
        val upcomingRaces = mutableListOf<Race>()
        for (i in (0..< races.size)) {
            if (races[i].resultats == null) {
                upcomingRaces.add(races[i])
            }
        }

        val raceMonths = upcomingRaces[raceId].date.split("/")[1].split("-")
        val raceMonth: String
        if (raceMonths.size == 2) {
            raceMonth = raceMonths[1].split(".")[0]
        } else {
            raceMonth = raceMonths[0].split(".")[0]
        }

        val monthMap = mapOf(
            "JAN" to Month.JANUARY,
            "FEV" to Month.FEBRUARY,
            "MARS" to Month.MARCH,
            "AVR" to Month.APRIL,
            "MAI" to Month.MAY,
            "JUIN" to Month.JUNE,
            "JUIL" to Month.JULY,
            "AOUT" to Month.AUGUST,
            "SEPT" to Month.SEPTEMBER,
            "OCT" to Month.OCTOBER,
            "NOV" to Month.NOVEMBER,
            "DEC" to Month.DECEMBER
        )

        val month = monthMap[raceMonth] ?: throw IllegalArgumentException("Invalid month race")
        val targetDate = LocalDateTime.of(LocalDateTime.now().year, month, upcomingRaces[raceId].date.split("/")[0].split("-")[1].toInt(), 0, 0)
        val currentDate = LocalDateTime.of(LocalDateTime.now().year, 4, 4, 20, 46, 0)
        val daysLeft = ChronoUnit.DAYS.between(currentDate, targetDate)
        val hoursLeft = ChronoUnit.HOURS.between(currentDate, targetDate) % 24
        val minutesLeft = ChronoUnit.MINUTES.between(currentDate, targetDate) % 60
        val rolexCard = findViewById<View>(R.id.rolexCardInclude)
        rolexCard.findViewById<TextView>(R.id.daysTV).text = daysLeft.toString()
        rolexCard.findViewById<TextView>(R.id.hoursTV).text = hoursLeft.toString()
        rolexCard.findViewById<TextView>(R.id.minsTV).text = minutesLeft.toString()
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}