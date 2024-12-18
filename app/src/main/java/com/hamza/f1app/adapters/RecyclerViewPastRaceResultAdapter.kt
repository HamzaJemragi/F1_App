package com.hamza.f1app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.Models.Resultat
import com.hamza.f1app.R
import com.hamza.f1app.data.constructors
import com.hamza.f1app.data.drivers
import com.hamza.f1app.data.races

class RecyclerViewPastRaceResultAdapter(private val resultats: List<Resultat>) :
    RecyclerView.Adapter<RecyclerViewPastRaceResultAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val position = view.findViewById<TextView>(R.id.position)
        val view = view.findViewById<View>(R.id.view)
        val driver = view.findViewById<TextView>(R.id.driverLastName)
        val time = view.findViewById<TextView>(R.id.time)
        val points = view.findViewById<TextView>(R.id.points)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.race_results_card, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return resultats.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val resultat = resultats[position]

        val driver = drivers.find { it.lastName == resultat.pilote.lastName }
        val constructorColor = constructors.find { it.id == driver?.equipe }!!.construcorColor

        holder.position.text = resultat.position.toString()
        holder.view.setBackgroundResource(constructorColor)
        holder.driver.text = resultat.pilote.lastName
        holder.time.text = resultat.temps
        holder.points.text = resultat.points.toString()
    }
}