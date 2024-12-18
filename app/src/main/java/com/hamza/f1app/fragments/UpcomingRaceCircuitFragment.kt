package com.hamza.f1app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.hamza.f1app.R
import com.hamza.f1app.data.circuits
import com.hamza.f1app.data.races

class UpcomingRaceCircuitFragment(private val circuitPosition: Int) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.race_circuit_fragment, container, false)

        val flag = view.findViewById<ImageView>(R.id.flag)
        val country = view.findViewById<TextView>(R.id.country)
        val year = view.findViewById<TextView>(R.id.year)
        val circuitName = view.findViewById<TextView>(R.id.circuitName)
        val circuit = view.findViewById<ImageView>(R.id.circuit)
        val circuitLength = view.findViewById<View>(R.id.circuit_length)
        val numberOfLaps = view.findViewById<View>(R.id.numberOfLaps)
        val firstGrandPrix = view.findViewById<View>(R.id.firstGrandPrix)
        val raceDistance = view.findViewById<View>(R.id.raceDistance)
        val lapRecord = view.findViewById<View>(R.id.lap_record)

        flag.setImageResource(circuits[circuitPosition].country.flag)
        country.text = circuits[circuitPosition].country.nom
        year.text = races[circuits[circuitPosition].race].annee.toString()
        circuitName.text = circuits[circuitPosition].nom
        circuit.setImageResource(circuits[circuitPosition].Image)
        circuitLength.findViewById<TextView>(R.id.circuit_length).text = circuits[circuitPosition].length.toString()
        numberOfLaps.findViewById<TextView>(R.id.infoTitle).text = "Number of lAPS"
        numberOfLaps.findViewById<TextView>(R.id.info).text = circuits[circuitPosition].laps.toString()
        firstGrandPrix.findViewById<TextView>(R.id.infoTitle).text = "First grand prix"
        firstGrandPrix.findViewById<TextView>(R.id.info).text = circuits[circuitPosition].firstGP.toString()
        raceDistance.findViewById<TextView>(R.id.number).text = circuits[circuitPosition].distance.toString()
        lapRecord.findViewById<TextView>(R.id.lap_record_number).text = circuits[circuitPosition].LapRecord.toString()
        lapRecord.findViewById<TextView>(R.id.lap_record_name).text = circuits[circuitPosition].LapRecord.toString()

        return view
    }
}