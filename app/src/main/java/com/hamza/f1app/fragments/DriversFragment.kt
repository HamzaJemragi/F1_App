package com.hamza.f1app.fragments

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.R
import com.hamza.f1app.activities.DriverinfoActivity

import com.hamza.f1app.adapters.RecyclerViewDriverAdapter
import com.hamza.f1app.data.drivers

class DriversFragment(context: Context) : Fragment(R.layout.fragment_constructors) {
    private lateinit var driverRecyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        driverRecyclerView = view.findViewById(R.id.driverRecyclerView)
        driverRecyclerView.layoutManager = LinearLayoutManager(context)
        val adapter= RecyclerViewDriverAdapter(drivers.toList(),object : RecyclerViewDriverAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                if(!drivers[position].retiredOrNot){
                    val intent = Intent(context, DriverinfoActivity::class.java)
                    intent.putExtra("driverPosition", position)
                    startActivity(intent)
                }else{
                    val dialog = Dialog(requireContext())
                    dialog.setContentView(R.layout.custom_dialog)

                    val okBTN = dialog.findViewById<TextView>(R.id.okBTN)
                    okBTN.setOnClickListener {
                        dialog.dismiss()
                    }

                    dialog.show()

                }

            }
        })
        driverRecyclerView.adapter = adapter
    }
}