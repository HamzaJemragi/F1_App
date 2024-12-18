package com.hamza.f1app.fragments

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.R
import com.hamza.f1app.activities.DriverinfoActivity
import com.hamza.f1app.activities.PastRaceInfosActivity
import com.hamza.f1app.adapters.RecyclerViewDriverAdapter
import com.hamza.f1app.adapters.RecyclerViewRacingAdapter
import com.hamza.f1app.data.drivers
import com.hamza.f1app.data.races

class PastRacingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.recyclerview_past_racing_fragment, container, false)

        val spinner = view.findViewById<Spinner>(R.id.spinner)
        val recyclerView = view.findViewById<RecyclerView>(R.id.racingRecyclerView)

        val adapter = RecyclerViewRacingAdapter(races, object : RecyclerViewRacingAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(context, PastRaceInfosActivity::class.java)
                intent.putExtra("racePosition", position)
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

        return view
    }
}