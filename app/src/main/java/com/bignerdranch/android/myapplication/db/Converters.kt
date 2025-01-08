package com.bignerdranch.android.myapplication.db

import androidx.room.TypeConverter
import com.bignerdranch.android.myapplication.models.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source) = source.name

    @TypeConverter
    fun toSource(name: String) = Source(name, name)

}