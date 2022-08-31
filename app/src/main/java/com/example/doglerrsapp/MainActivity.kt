package com.example.doglerrsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv : RecyclerView = findViewById(R.id.recyclerView)


        rv.layoutManager = LinearLayoutManager(this)



        val itemss = fetchData()
        val adapObj = dogAdapter(itemss)

        rv.adapter = adapObj


    }

    private fun fetchData(): ArrayList<String> {

        val list = ArrayList<String>()
        for (i in 0..100) {
            list.add(" Number $i")

        }
        return list

    }
}