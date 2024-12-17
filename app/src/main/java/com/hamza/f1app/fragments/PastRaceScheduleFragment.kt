package com.hamza.f1app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.R
import com.hamza.f1app.adapters.RecycleViewPastRaceAdapter
import com.hamza.f1app.data.*
import kotlin.time.Duration.Companion.days

class PastRaceScheduleFragment(val racePosition: Int): Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.past_race_schedule_fragment, container, false)

        val trackImage = view.findViewById<ImageView>(R.id.raceTrack)
        val dateText = view.findViewById<TextView>(R.id.raceDate)
        val yearText = view.findViewById<TextView>(R.id.raceYear)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        val button = view.findViewById<Button>(R.id.viewResultsButton)
        val reliveTheActionText = view.findViewById<TextView>(R.id.reliveTheAction)
        val raceTitleText = view.findViewById<TextView>(R.id.raceTitle)
        val cardView = view.findViewById<View>(R.id.cardView)

        trackImage.setImageResource(races[racePosition].track)
        dateText.text = "${races[racePosition].date.split("-") + " " + races[racePosition].date.split("/")[1].split("-") + " - " + races[racePosition].date.split("-")[1] + " " + races[racePosition].date.split("/")[1].split("-")[1]}"
        yearText.text = races[racePosition].nom.takeLast(4)
        recyclerView.adapter = RecycleViewPastRaceAdapter(resultats[racePosition])
        button.setOnClickListener {

        }

        return view
    }
}