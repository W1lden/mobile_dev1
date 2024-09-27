package com.example.assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val samplePosts = listOf(
            Post(R.drawable.img1, "Caption for image 1"),
            Post(R.drawable.img2, "Caption for image 2"),
            Post(R.drawable.img3, "Caption for image 3")
        )

        val adapter = PostAdapter(samplePosts)
        recyclerView.adapter = adapter
    }
}
