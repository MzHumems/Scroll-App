package com.example.scrollapp.data

import com.example.scrollapp.R
import com.example.scrollapp.model.Motivasi

class ListMotivasi() {
    fun LoadMotivasi(): List<Motivasi>{
        return listOf<Motivasi>(
            Motivasi(R.drawable.image1, R.string.affirmation1),
            Motivasi(R.drawable.image2, R.string.affirmation2),
            Motivasi(R.drawable.image3, R.string.affirmation3),
            Motivasi(R.drawable.image4, R.string.affirmation4),
            Motivasi(R.drawable.image5, R.string.affirmation5),
            Motivasi(R.drawable.image6, R.string.affirmation6),
            Motivasi(R.drawable.image7, R.string.affirmation7),
            Motivasi(R.drawable.image8, R.string.affirmation8),
            Motivasi(R.drawable.image9, R.string.affirmation9),
            Motivasi(R.drawable.image10, R.string.affirmation10),
        )
    }
}