package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @DrawableRes val image: Int,
    @StringRes val name: Int,
    val availableCourses: Int
    )
