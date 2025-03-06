package com.example.recyclerviewact

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.f1drivers.Driver
import com.example.f1drivers.DriverAdapter



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.driverRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val drivers = listOf(
            Driver("Max Verstappen", "Red Bull Racing", R.drawable.verstappen),
            Driver("Liam Lawson", "Red Bull Racing", R.drawable.lawson),
            Driver("Andrea Kimi Antonelli", "Mercedes", R.drawable.antonelli),
            Driver("George Russell", "Mercedes", R.drawable.russell),
            Driver("Charles Leclerc", "Ferrari", R.drawable.leclerc),
            Driver("Lewis Hamilton", "Ferrari", R.drawable.hamilton),
            Driver("Lando Norris", "McLaren", R.drawable.norris),
            Driver("Oscar Piastri", "McLaren", R.drawable.piastri),
            Driver("Fernando Alonso", "Aston Martin", R.drawable.alonso),
            Driver("Lance Stroll", "Aston Martin", R.drawable.stroll),
            Driver("Pierre Gasly", "Alpine", R.drawable.gasly),
            Driver("Jack Doohan", "Alpine", R.drawable.doohan),
            Driver("Alexander Albon", "Williams", R.drawable.albon),
            Driver("Carlos Sainz", "Williams", R.drawable.sainz),
            Driver("Gabriel Bortoleto", "Kick Sauber", R.drawable.bortoleto),
            Driver("Nico Hulkenberg", "Kick Sauber", R.drawable.hulkenberg),
            Driver("Isack Hadjar", "VCARB", R.drawable.hadjar),
            Driver("Yuki Tsunoda", "VCARB", R.drawable.tsunoda),
            Driver("Esteban Ocon", "Haas", R.drawable.ocon),
            Driver("Oliver Bearman", "Haas", R.drawable.bearman)
        )

        val adapter = DriverAdapter(drivers)
        recyclerView.adapter = adapter
    }
}