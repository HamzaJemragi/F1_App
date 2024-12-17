package com.hamza.f1app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.Models.Resultat
import com.hamza.f1app.R

class RecycleViewPastRaceAdapter(private val results: List<Resultat>): RecyclerView.Adapter<RecycleViewPastRaceAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val position = view.findViewById<TextView>(R.id.position)
        val driverFirstName = view.findViewById<TextView>(R.id.driverFirstName)
        val driverLastName = view.findViewById<TextView>(R.id.driverLastName)
        val time = view.findViewById<TextView>(R.id.time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.race_standings_card, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return results.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val result = results[position]

        holder.position.text = result.position.toString()
        holder.driverFirstName.text = result.pilote.firsName
        holder.driverLastName.text = result.pilote.lastName
        holder.time.text = result.temps

    }
}