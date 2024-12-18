package com.hamza.f1app.fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.hamza.f1app.R
import com.hamza.f1app.activities.PastRaceResultActivity
import com.hamza.f1app.activities.UpcomingRaceResultActivity
import com.hamza.f1app.data.races
import java.time.LocalDateTime
import java.time.Month
import java.time.temporal.ChronoUnit

class UpcomingRaceScheduleFragment(val racePosition: Int): Fragment() {
    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val raceMonth = races[racePosition].date.split("/")[1].split("-")[1]

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
        val targetDate = LocalDateTime.of(LocalDateTime.now().year, month, races[racePosition].date.split("/")[0].split("-")[1].toInt(), 0, 0)
        val currentDate = LocalDateTime.of(LocalDateTime.now().year, 4, 4, 12, 8, 0)
        val daysLeft = ChronoUnit.DAYS.between(targetDate, currentDate)
        val hoursLeft = ChronoUnit.HOURS.between(targetDate, currentDate) % 24
        val minutesLeft = ChronoUnit.MINUTES.between(targetDate, currentDate) % 60

        val view = inflater.inflate(R.layout.upcoming_race_schedule_fragment, container, false)

        val trackImage = view.findViewById<ImageView>(R.id.raceTrack)
        val dateText = view.findViewById<TextView>(R.id.raceDate)
        val yearText = view.findViewById<TextView>(R.id.raceYear)
        val rolexCard = view.findViewById<View>(R.id.rolexCardInclude)
        val raceTitleText = view.findViewById<TextView>(R.id.raceTitle)
        val timeCard = view.findViewById<View>(R.id.timeCard)

        trackImage.setImageResource(races[racePosition].track)
        dateText.text = "${races[racePosition].date.split("/")[0].split("-")[1] + " " + races[racePosition].date.split("/")[1].split("-")[0] + " - " + races[racePosition].date.split("/")[0].split("-")[1] + " " + races[racePosition].date.split("/")[1].split("-")[1]}"
        yearText.text = races[racePosition].nom.takeLast(4)+ " " + races
        rolexCard.findViewById<TextView>(R.id.daysTV).text = daysLeft.toString()
        rolexCard.findViewById<TextView>(R.id.hoursTV).text = hoursLeft.toString()
        rolexCard.findViewById<TextView>(R.id.minsTV).text = minutesLeft.toString()
        raceTitleText.text = races[racePosition].nom
        timeCard.findViewById<TextView>(R.id.day).text = races[racePosition].date.split("/")[0].split("-")[1]
        timeCard.findViewById<TextView>(R.id.month).text = races[racePosition].date.split("/")[1].split("-")[1]
        timeCard.findViewById<TextView>(R.id.time).text = races[racePosition].time
        timeCard.setOnClickListener{
            val intent = Intent(context, UpcomingRaceResultActivity::class.java)
            intent.putExtra("racePosition", racePosition)
            startActivity(intent)
        }

        return view
    }
}