package com.example.lab01angelanabhan


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val newsList = listOf(
            News("Tech News", "New AI breakthrough announced", R.drawable.baseline_computer_24),
            News("Sports News", "Team wins championship", R.drawable.sports_icon),
            News("Health News", "New vaccine discovered", R.drawable.favorite_icon),
            News("World News", "Global summit held today", R.drawable.public_icon),
            News("Finance News", "Stock market rises", R.drawable.attach_money_icon)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = NewsAdapter(newsList)

        val divider = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(divider)
    }
}