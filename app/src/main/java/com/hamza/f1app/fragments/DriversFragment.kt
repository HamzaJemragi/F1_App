package com.hamza.f1app.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.R
import com.hamza.f1app.activities.DriverinfoActivity

import com.hamza.f1app.adapters.RecyclerViewDriverAdapter
import com.hamza.f1app.data.drivers

class DriversFragment() : Fragment(R.layout.fragment_drivers) {
    private lateinit var driverRecyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        driverRecyclerView = view.findViewById(R.id.driverRecyclerView)
        driverRecyclerView.layoutManager = LinearLayoutManager(context)
        val adapter= RecyclerViewDriverAdapter(drivers.toList(),object : RecyclerViewDriverAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(context, DriverinfoActivity::class.java)
                intent.putExtra("driverPosition", position)
                startActivity(intent)
            }
        })
        driverRecyclerView.adapter = adapter
    }
}