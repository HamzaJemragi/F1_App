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
import com.hamza.f1app.activities.ConstructorinfoActivity
import com.hamza.f1app.adapters.StandingConstructorAdapter
import com.hamza.f1app.data.constructors


class ConstructorStandingFragment(): Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.standing_constructors, container, false)

        val constructorStandingRecyclerView=view.findViewById<RecyclerView>(R.id.constructorStandingRecyclerView)
        constructorStandingRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter= StandingConstructorAdapter(constructors.toList(),object : StandingConstructorAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(requireContext(), ConstructorinfoActivity::class.java)
                intent.putExtra("constructorPosition", position)
                startActivity(intent)
            }
        } )

        constructorStandingRecyclerView.adapter=adapter

        return view
    }
}