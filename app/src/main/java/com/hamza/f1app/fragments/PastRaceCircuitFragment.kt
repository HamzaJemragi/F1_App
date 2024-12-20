package com.hamza.f1app.fragments

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

class PastRaceCircuitFragment(private val circuitPosition: Int) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.race_circuit_fragment, container, false)

        val pastRaces = mutableListOf<Race>()
        for (i in (0..< races.size)) {
            if (races[i].resultats != null) {
                pastRaces.add(races[i])
            }
        }

        val pastCircuits = mutableListOf<Circuit>()
        for (i in (0..< circuits.size)) {
            for (race in pastRaces) {
                if (circuits[i].race == race.id) {
                    pastCircuits.add(circuits[i])
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

        flag.setImageResource(pastCircuits[circuitPosition].country.flag)
        country.text = pastCircuits[circuitPosition].country.nom
        year.text = pastRaces[circuitPosition].annee.toString()
        circuitName.text = pastCircuits[circuitPosition].nom
        circuit.setImageResource(pastCircuits[circuitPosition].Image)
        circuitLength.findViewById<TextView>(R.id.lengthNumber).text = pastCircuits[circuitPosition].length.toString()
        numberOfLaps.findViewById<TextView>(R.id.infoTitleMini).text = "Number of laps"
        numberOfLaps.findViewById<TextView>(R.id.info).text = pastCircuits[circuitPosition].laps.toString()
        firstGrandPrix.findViewById<TextView>(R.id.infoTitleMini).text = "First grand prix"
        firstGrandPrix.findViewById<TextView>(R.id.info).text = pastCircuits[circuitPosition].firstGP.toString()
        raceDistance.findViewById<TextView>(R.id.number).text = pastCircuits[circuitPosition].distance.toString()
        lapRecord.findViewById<TextView>(R.id.lap_record_number).text = pastCircuits[circuitPosition].LapRecord.get("Time").toString()
        lapRecord.findViewById<TextView>(R.id.lap_record_name).text = pastCircuits[circuitPosition].LapRecord.get("Driver").toString() + " " + pastCircuits[circuitPosition].LapRecord.get("Year").toString()

        return view
    }
}