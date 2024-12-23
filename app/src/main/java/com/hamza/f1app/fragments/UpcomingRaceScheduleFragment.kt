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
import com.hamza.f1app.Models.Race
import com.hamza.f1app.R
import com.hamza.f1app.activities.UpcomingRaceResultActivity
import com.hamza.f1app.data.races
import java.time.LocalDateTime
import java.time.Month
import java.time.temporal.ChronoUnit

class UpcomingRaceScheduleFragment(val raceId: Int): Fragment() {
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.upcoming_race_schedule_fragment, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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

        val trackImage = view.findViewById<ImageView>(R.id.raceTrack)
        val dateText = view.findViewById<TextView>(R.id.raceDate)
        val month = monthMap[raceMonth] ?: throw IllegalArgumentException("Invalid month race")
        val targetDate = LocalDateTime.of(LocalDateTime.now().year, month, upcomingRaces[raceId].date.split("/")[0].split("-")[1].toInt(), 0, 0)
        val currentDate = LocalDateTime.of(LocalDateTime.now().year, Month.APRIL, 4, 20, 46, 0)
        val daysLeft = ChronoUnit.DAYS.between(currentDate, targetDate)
        val hoursLeft = ChronoUnit.HOURS.between(currentDate, targetDate) % 24
        val minutesLeft = ChronoUnit.MINUTES.between(currentDate, targetDate) % 60
        val months = upcomingRaces[raceId].date.split("/")[1].split("-")
        val yearText = view.findViewById<TextView>(R.id.raceYear)
        val rolexCard = view.findViewById<View>(R.id.rolexCardInclude)
        val raceTitleText = view.findViewById<TextView>(R.id.raceTitle)
        val timeCard = view.findViewById<View>(R.id.timeCard)

        trackImage.setImageResource(upcomingRaces[raceId].track)
        if (months.size == 2) {
            dateText.text = "${upcomingRaces[raceId].date.split("/")[0].split("-")[0] + " " + upcomingRaces[raceId].date.split("/")[1].split("-")[0] + " - " + upcomingRaces[raceId].date.split("/")[0].split("-")[1] + " " + upcomingRaces[raceId].date.split("/")[1].split("-")[1]}"
        } else {
            dateText.text = "${upcomingRaces[raceId].date.split("/")[0].split("-")[0] + " " + upcomingRaces[raceId].date.split("/")[1].split("-")[0] + " - " + upcomingRaces[raceId].date.split("/")[0].split("-")[1] + " " + upcomingRaces[raceId].date.split("/")[1].split("-")[0]}"
        }
        yearText.text = upcomingRaces[raceId].nom.takeLast(4)
        rolexCard.findViewById<TextView>(R.id.daysTV).text = daysLeft.toString()
        rolexCard.findViewById<TextView>(R.id.hoursTV).text = hoursLeft.toString()
        rolexCard.findViewById<TextView>(R.id.minsTV).text = minutesLeft.toString()
        raceTitleText.text = upcomingRaces[raceId].nom
        timeCard.findViewById<TextView>(R.id.day).text = upcomingRaces[raceId].date.split("/")[0].split("-")[1]
        if (months.size == 2) {
            timeCard.findViewById<TextView>(R.id.month).text = upcomingRaces[raceId].date.split("/")[1].split("-")[1]
        } else {
            timeCard.findViewById<TextView>(R.id.month).text = upcomingRaces[raceId].date.split("/")[1].split("-")[0]
        }
        timeCard.findViewById<TextView>(R.id.time).text = upcomingRaces[raceId].time
        timeCard.setOnClickListener{
            val intent = Intent(context, UpcomingRaceResultActivity::class.java)
            intent.putExtra("raceId", raceId)
            val options = android.app.ActivityOptions.makeCustomAnimation(
                requireContext(),
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent, options.toBundle())
        }
    }
}