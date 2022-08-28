package com.example.affirmations.data
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation
import com.squareup.picasso.Picasso

class Datasource {
    fun loadAffirmations(): List<Affirmation>{
        return listOf(
            Affirmation(R.string.affirmation1, "https://i.imgur.com/MGfS5pn.jpeg"),
            Affirmation(R.string.affirmation2, "https://i.imgur.com/KkRfhVA.jpeg"),
            Affirmation(R.string.affirmation3, "https://i.imgur.com/9EaQE60.jpeg"),
            Affirmation(R.string.affirmation4, "https://i.imgur.com/kTXta4O.jpeg"),
            Affirmation(R.string.affirmation5, "https://i.imgur.com/RbBsCRE.jpeg"),
            Affirmation(R.string.affirmation6, "https://i.imgur.com/ZZ2xTby.jpeg"),
            Affirmation(R.string.affirmation7, "https://i.imgur.com/RUdyz2a.jpeg"),
            Affirmation(R.string.affirmation8, "https://i.imgur.com/UPlgIjc.jpeg"),
            Affirmation(R.string.affirmation9, "https://i.imgur.com/PZ3a8mA.jpeg"),
            Affirmation(R.string.affirmation10, "https://i.imgur.com/e3O37WY.jpeg")
        )
    }
}