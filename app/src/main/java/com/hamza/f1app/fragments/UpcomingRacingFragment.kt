package com.hamza.f1app.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.Models.Race
import com.hamza.f1app.R
import com.hamza.f1app.activities.UpcomingRaceInfosActivity
import com.hamza.f1app.adapters.UpcomingRaceAdapter
import com.hamza.f1app.data.races

class UpcomingRacingFragment : Fragment(R.layout.recyclerview_upcoming_racing_fragment) {
    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.racingRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val upcomingRaces = mutableListOf<Race>()
        for (i in (0..< races.size)) {
            if (races[i].resultats == null) {
                upcomingRaces.add(races[i])
            }
        }
        val adapter = UpcomingRaceAdapter(requireContext(), upcomingRaces, object : UpcomingRaceAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(context, UpcomingRaceInfosActivity::class.java)
                intent.putExtra("raceId", position)
                val options = android.app.ActivityOptions.makeCustomAnimation(
                    requireContext(),
                    R.anim.slide_in_right,
                    R.anim.slide_out_left
                )
                startActivity(intent, options.toBundle())
            }
        })
        recyclerView.adapter = adapter
    }
}