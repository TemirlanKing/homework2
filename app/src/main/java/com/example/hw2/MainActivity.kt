package com.example.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val skins = mutableListOf(
            Skin(name = "AWP Dragon Lore", image = R.drawable.awp),
            Skin(name = "AK-47 Vulcan", image = R.drawable.kalaw),
            Skin(name = "AUG Chameleon", image = R.drawable.aug),
            Skin(name = "M4A1S Hot Rod", image = R.drawable.mk),
            Skin(name = "P90 Azimov", image = R.drawable.petuh),
            Skin(name = "Kirambit Tiger Tooth", image = R.drawable.nojik)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SkinAdapter(applicationContext, skins)
    }
}