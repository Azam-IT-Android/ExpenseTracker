package com.ismail.creatvt.expensetracker.database

import androidx.room.TypeConverter
import java.util.*

object DateConverter {

    @TypeConverter
    @JvmStatic
    fun fromDate(date: Date):Long{
        return date.time
    }

    @TypeConverter
    @JvmStatic
    fun fromLong(long:Long):Date{
        return Date(long)
    }

}