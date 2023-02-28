package com.example.dogglers.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Dog(
    @StringRes val dogName: Int,
    @StringRes val dogAge: Int,
    @DrawableRes val dogImage: Int,
    @StringRes val dogHobbies: Int
)
