package com.bignerdranch.android.myapplication

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NewsApplication:Application() {
  val aboba = "em s pola"
}
