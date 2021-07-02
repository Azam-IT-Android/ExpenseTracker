package com.ismail.creatvt.expensetracker

import android.content.Context
import androidx.room.Room
import com.ismail.creatvt.expensetracker.database.ExpenseDatabase

fun getDatabase(context: Context): ExpenseDatabase {
    return Room.databaseBuilder(
        context,
        ExpenseDatabase::class.java, "expense-database"
    ).build()
}