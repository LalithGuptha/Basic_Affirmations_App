package com.example.affirmationsapp.data

import com.example.affirmationsapp.R
import com.example.affirmationsapp.model.affirmations

class datasource {

    fun loadaffirmations(): MutableList<affirmations> {
        var affirmation : MutableList<affirmations>

        return mutableListOf<affirmations>(affirmations(R.string.a1,R.drawable.image2),
            affirmations(R.string.a2,R.drawable.image3),
            affirmations(R.string.a3,R.drawable.image4),
            affirmations(R.string.a4,R.drawable.image5),
            affirmations(R.string.a5,R.drawable.image6),
            affirmations(R.string.a6,R.drawable.image1),
            affirmations(R.string.a7,R.drawable.image7),
            affirmations(R.string.a8,R.drawable.image8),
            affirmations(R.string.a9,R.drawable.image9),
            affirmations(R.string.a10,R.drawable.image10))
    }
}