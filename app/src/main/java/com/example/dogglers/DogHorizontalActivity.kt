package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapters.DogCardAdapter
import com.example.dogglers.data.DataSource

class DogHorizontalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_horizontal)

        val horizontalDataSet = DataSource().loadDogCards()

        val horizontalRecyclerView = findViewById<RecyclerView>(R.id.doggler_horizontal_recycler_view)
        horizontalRecyclerView.adapter = DogCardAdapter(this, horizontalDataSet)

        horizontalRecyclerView.setHasFixedSize(true)
    }
}
