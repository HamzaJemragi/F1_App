package com.hamza.f1app.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.Models.Resultat
import com.hamza.f1app.R
import com.hamza.f1app.data.constructors

class RecyclerViewPastRaceResultAdapter(private val resultats: List<Resultat>, private val context: Context) :
    RecyclerView.Adapter<RecyclerViewPastRaceResultAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val position = view.findViewById<TextView>(R.id.positionValue)
        val viewColor = view.findViewById<View>(R.id.viewResult)
        val driver = view.findViewById<TextView>(R.id.driverLastNameValue)
        val time = view.findViewById<TextView>(R.id.timeValue)
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

        holder.position.text = resultat.position.toString()
        for (i in constructors) {
            if (i.id == resultat.pilote.equipe) {
                holder.viewColor.setBackgroundColor(ContextCompat.getColor(context, i.construcorColor))
            }
        }

        holder.driver.text = resultat.pilote.lastName
        holder.time.text = resultat.temps
        holder.points.text = resultat.points.toString()
    }
}