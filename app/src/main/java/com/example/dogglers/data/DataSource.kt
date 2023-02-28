package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dog

class DataSource {
    fun loadDogCards(): List<Dog> {
        return listOf<Dog>(
            Dog(R.string.dog_name_1, R.string.dog_age_1, R.drawable.dog1, R.string.dog_hobbies_1),
            Dog(R.string.dog_name_1, R.string.dog_age_1, R.drawable.dog1, R.string.dog_hobbies_1),
            Dog(R.string.dog_name_1, R.string.dog_age_1, R.drawable.dog1, R.string.dog_hobbies_1),
            Dog(R.string.dog_name_1, R.string.dog_age_1, R.drawable.dog1, R.string.dog_hobbies_1),
            Dog(R.string.dog_name_1, R.string.dog_age_1, R.drawable.dog1, R.string.dog_hobbies_1),
            Dog(R.string.dog_name_1, R.string.dog_age_1, R.drawable.dog1, R.string.dog_hobbies_1),
            Dog(R.string.dog_name_1, R.string.dog_age_1, R.drawable.dog1, R.string.dog_hobbies_1),
            Dog(R.string.dog_name_1, R.string.dog_age_1, R.drawable.dog1, R.string.dog_hobbies_1),
            Dog(R.string.dog_name_1, R.string.dog_age_1, R.drawable.dog1, R.string.dog_hobbies_1)
        )
    }
}
