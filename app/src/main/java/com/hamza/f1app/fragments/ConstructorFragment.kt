package com.hamza.f1app.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.R
import com.hamza.f1app.adapters.RecyclerViewConstructorAdabter
import com.hamza.f1app.data.constructors
import com.hamza.f1app.activities.ConstructorinfoActivity

class ConstructorFragment() : Fragment(R.layout.fragment_constructors) {
    private lateinit var constructorRecyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        constructorRecyclerView = view.findViewById(R.id.constructorRecyclerView)
        constructorRecyclerView.layoutManager = LinearLayoutManager(context)
        val adapter= RecyclerViewConstructorAdabter(constructors.toList(),object : RecyclerViewConstructorAdabter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(context, ConstructorinfoActivity::class.java)
                intent.putExtra("constructorPosition", position)
                startActivity(intent)
            }
        })
        constructorRecyclerView.adapter = adapter

    }
}