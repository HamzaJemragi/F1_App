package com.hamza.f1app.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.hamza.f1app.Models.Circuit
import com.hamza.f1app.Models.Race
import com.hamza.f1app.R
import com.hamza.f1app.data.circuits
import com.hamza.f1app.data.races

class UpcomingRaceCircuitFragment(private val circuitPosition: Int) : Fragment() {
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.race_circuit_fragment, container, false)

        val upcomingRaces = mutableListOf<Race>()
        for (i in (0..< races.size)) {
            if (races[i].resultats == null) {
                upcomingRaces.add(races[i])
            }
        }
        val upcomingCircuits = mutableListOf<Circuit>()
        for (i in (0..< circuits.size)) {
            for (race in upcomingRaces) {
                if (circuits[i].race == race.id) {
                    upcomingCircuits.add(circuits[i])
                }
            }
        }

        val flag = view.findViewById<ImageView>(R.id.flag)
        val country = view.findViewById<TextView>(R.id.country)
        val year = view.findViewById<TextView>(R.id.year)
        val circuitName = view.findViewById<TextView>(R.id.circuitName)
        val circuit = view.findViewById<ImageView>(R.id.circuit)
        val circuitLength = view.findViewById<View>(R.id.circuit_lengthView)
        val numberOfLaps = view.findViewById<View>(R.id.numberOfLaps)
        val firstGrandPrix = view.findViewById<View>(R.id.firstGrandPrix)
        val raceDistance = view.findViewById<View>(R.id.raceDistance)
        val lapRecord = view.findViewById<View>(R.id.lap_recordView)

        flag.setImageResource(upcomingCircuits[circuitPosition].country.flag)
        country.text = upcomingCircuits[circuitPosition].country.nom
        year.text = upcomingRaces[circuitPosition].annee.toString()
        circuitName.text = upcomingCircuits[circuitPosition].nom
        circuit.setImageResource(upcomingCircuits[circuitPosition].Image)
        circuitLength.findViewById<TextView>(R.id.lengthNumber).text = upcomingCircuits[circuitPosition].length.toString()
        numberOfLaps.findViewById<TextView>(R.id.infoTitleMini).text = "Number of laps"
        numberOfLaps.findViewById<TextView>(R.id.info).text = upcomingCircuits[circuitPosition].laps.toString()
        firstGrandPrix.findViewById<TextView>(R.id.infoTitleMini).text = "First grand prix"
        firstGrandPrix.findViewById<TextView>(R.id.info).text = upcomingCircuits[circuitPosition].firstGP.toString()
        raceDistance.findViewById<TextView>(R.id.number).text = upcomingCircuits[circuitPosition].distance.toString()
        lapRecord.findViewById<TextView>(R.id.lap_record_number).text = upcomingCircuits[circuitPosition].LapRecord.get("Time").toString()
        lapRecord.findViewById<TextView>(R.id.lap_record_name).text = upcomingCircuits[circuitPosition].LapRecord.get("Driver").toString() + " " + upcomingCircuits[circuitPosition].LapRecord.get("Year").toString()

        return view
    }
}