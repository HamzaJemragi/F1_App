package com.hamza.f1app.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hamza.f1app.R
import com.hamza.f1app.activities.LatestinfoActivity
import com.hamza.f1app.adapters.RecyclerViewLatestAdapter
import com.hamza.f1app.data.latest

class LatestFragment : Fragment(R.layout.fragment_latest){
    private lateinit var latestRecyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        latestRecyclerView=view.findViewById(R.id.latestRecyclerView)
        latestRecyclerView.layoutManager= LinearLayoutManager(context)

        val adapter= RecyclerViewLatestAdapter(latest,requireContext(), object : RecyclerViewLatestAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(context, LatestinfoActivity::class.java)
                intent.putExtra("latestPosition", position)
                val options = android.app.ActivityOptions.makeCustomAnimation(
                    requireContext(),
                    R.anim.slide_in_right,
                    R.anim.slide_out_left
                )
                startActivity(intent, options.toBundle())
            }

        })
        latestRecyclerView.adapter=adapter

    }
}