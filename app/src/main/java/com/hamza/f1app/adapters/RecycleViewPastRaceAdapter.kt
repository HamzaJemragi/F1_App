package com.hamza.f1app.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.Models.Resultat
import com.hamza.f1app.R
import com.hamza.f1app.data.constructors
import com.hamza.f1app.data.drivers

class RecycleViewPastRaceAdapter(private val results: List<Resultat>, private val context: Context): RecyclerView.Adapter<RecycleViewPastRaceAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val position = view.findViewById<TextView>(R.id.position)
        val viewColor = view.findViewById<View>(R.id.viewStanding)
        val driverFirstName = view.findViewById<TextView>(R.id.driverFirstName)
        val driverLastName = view.findViewById<TextView>(R.id.driverLastNameStanding)
        val time = view.findViewById<TextView>(R.id.timeStanding)
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
        for (i in constructors) {
            if (i.id == result.pilote.equipe) {
                holder.viewColor.setBackgroundColor(ContextCompat.getColor(context, i.construcorColor))
            }
        }
        holder.driverFirstName.text = result.pilote.firsName
        holder.driverLastName.text = result.pilote.lastName
        holder.time.text = result.temps
    }
}