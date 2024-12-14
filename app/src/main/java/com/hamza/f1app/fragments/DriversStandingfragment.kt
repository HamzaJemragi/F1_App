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
import com.hamza.f1app.activities.DriverinfoActivity
import com.hamza.f1app.adapters.StandingDriversAdapter
import com.hamza.f1app.data.drivers


class DriversStandingFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.standing_drivers, container, false)

        val driversStandingRecyclerView=view.findViewById<RecyclerView>(R.id.driversStandingRecyclerView)
        driversStandingRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        val adapter= StandingDriversAdapter(drivers,object : StandingDriversAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(requireContext(), DriverinfoActivity::class.java)
                intent.putExtra("driverPosition", position)
                startActivity(intent)
            }
        } )

        driversStandingRecyclerView.adapter=adapter

        return view
    }
}