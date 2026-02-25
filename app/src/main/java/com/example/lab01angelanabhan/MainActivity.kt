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
            News("Tech News", "New AI breakthrough announced", R.mipmap.ic_launcher),
            News("Sports News", "Team wins championship", R.mipmap.ic_launcher),
            News("Health News", "New vaccine discovered", R.mipmap.ic_launcher),
            News("World News", "Global summit held today", R.mipmap.ic_launcher),
            News("Finance News", "Stock market rises", R.mipmap.ic_launcher)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = NewsAdapter(newsList)

        val divider = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(divider)
    }
}