package com.hamza.f1app.fragments

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.Models.Race
import com.hamza.f1app.R
import com.hamza.f1app.activities.PastRaceResultActivity
import com.hamza.f1app.adapters.RecycleViewPastRaceAdapter
import com.hamza.f1app.data.*
import java.time.Month

class PastRaceScheduleFragment(val raceId: Int): Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.past_race_schedule_fragment, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pastRaces = mutableListOf<Race>()
        for (i in (0..< races.size)) {
            if (races[i].resultats != null) {
                pastRaces.add(races[i])
            }
        }

        val raceMonths = pastRaces[raceId].date.split("/")[1].split("-")
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

        val trackImage = view.findViewById<ImageView>(R.id.pastRaceTrack)
        val dateText = view.findViewById<TextView>(R.id.pastRaceDate)
        val months = pastRaces[raceId].date.split("/")[1].split("-")
        val yearText = view.findViewById<TextView>(R.id.pastRaceYear)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewTop3)
        val button = view.findViewById<Button>(R.id.viewResultsButton)
        val reliveTheActionText = view.findViewById<TextView>(R.id.reliveTheAction)
        val raceTitleText = view.findViewById<TextView>(R.id.pastRaceTitle)
        val timeCard = view.findViewById<View>(R.id.timeCardFinished)

        trackImage.setImageResource(pastRaces[raceId].track)
        if (months.size == 2) {
            dateText.text = "${pastRaces[raceId].date.split("/")[0].split("-")[0] + " " + pastRaces[raceId].date.split("/")[1].split("-")[0] + " - " + pastRaces[raceId].date.split("/")[0].split("-")[1] + " " + pastRaces[raceId].date.split("/")[1].split("-")[1]}"
        } else {
            dateText.text = "${pastRaces[raceId].date.split("/")[0].split("-")[0] + " " + pastRaces[raceId].date.split("/")[1].split("-")[0] + " - " + pastRaces[raceId].date.split("/")[0].split("-")[1] + " " + pastRaces[raceId].date.split("/")[1].split("-")[0]}"
        }
        yearText.text = pastRaces[raceId].nom.takeLast(4)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = pastRaces[raceId].resultats?.take(3)?.let { RecycleViewPastRaceAdapter(it, requireContext()) }
        button.setOnClickListener {
            val intent = Intent(context, PastRaceResultActivity::class.java)
            intent.putExtra("raceId", raceId)
            val options = android.app.ActivityOptions.makeCustomAnimation(
                requireContext(),
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity(intent, options.toBundle())
        }
        reliveTheActionText.text = getString(R.string.relive_the_action)
        raceTitleText.text = pastRaces[raceId].nom
        timeCard.findViewById<TextView>(R.id.day).text = pastRaces[raceId].date.split("/")[0].split("-")[1]
        if (months.size == 2) {
            timeCard.findViewById<TextView>(R.id.month).text = pastRaces[raceId].date.split("/")[1].split("-")[1]
        } else {
            timeCard.findViewById<TextView>(R.id.month).text = pastRaces[raceId].date.split("/")[1].split("-")[0]
        }

        timeCard.setOnClickListener{
            val intent = Intent(context, PastRaceResultActivity::class.java)
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