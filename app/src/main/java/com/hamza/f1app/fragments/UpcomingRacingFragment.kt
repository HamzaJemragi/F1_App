package com.hamza.f1app.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.R
import com.hamza.f1app.activities.PastRaceInfosActivity
import com.hamza.f1app.adapters.RecyclerViewRacingAdapter
import com.hamza.f1app.data.races

class UpcomingRacingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.recyclerview_upcoming_racing_fragment, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.racingRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter = RecyclerViewRacingAdapter(races, object : RecyclerViewRacingAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(context, PastRaceInfosActivity::class.java)
                intent.putExtra("racePosition", position)
                startActivity(intent)
            }
        })
        recyclerView.adapter = adapter

        return view
    }
}