package com.hamza.f1app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.hamza.f1app.R
import com.hamza.f1app.data.drivers

class DriverBioFragment(val driverPosition:Int): Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.driver_bio, container, false)

        val bio = view.findViewById<TextView>(R.id.bio)
        val searchID = "ID" + drivers[driverPosition].id
        bio.text = getString(resources.getIdentifier(searchID, "string", context?.packageName))

        return view
    }
}