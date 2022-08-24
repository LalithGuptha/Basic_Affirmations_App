package com.example.affirmationsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationsapp.adapter.ItemAdapter
import com.example.affirmationsapp.data.datasource


class MainActivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val sizesofaffir : TextView = findViewById(R.id.text1)

        //sizesofaffir.text= datasource().loadaffirmations().size.toString()

        val myDataset = datasource().loadaffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)


    }


    }
