package com.hamza.f1app.fragments

import com.hamza.f1app.Models.Race
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.R
import com.hamza.f1app.activities.PastRaceInfosActivity
import com.hamza.f1app.adapters.PastRaceAdapter
import com.hamza.f1app.data.races

class PastRacingFragment : Fragment(R.layout.recyclerview_past_racing_fragment) {
    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        val spinner = view.findViewById<Spinner>(R.id.spinner)
        val recyclerView = view.findViewById<RecyclerView>(R.id.racingRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val pastRaces = mutableListOf<Race>()
        for (i in (0..< races.size)) {
            if (races[i].resultats != null) {
                pastRaces.add(races[i])
            }
        }

        val adapter = PastRaceAdapter(requireContext(), pastRaces, object : PastRaceAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(context, PastRaceInfosActivity::class.java)
                intent.putExtra("raceId", position)
                startActivity(intent)
            }
        })
        recyclerView.adapter = adapter

        val years = (2024 downTo 1950).toList()

        val spinnerAdapter =
            ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, years)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = spinnerAdapter

//        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
//                val selectedItem = parent.getItemAtPosition(position).toString()
//                Toast.makeText(this@RacingActivity, "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>) {}
//        }
    }
}