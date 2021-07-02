package com.ismail.creatvt.expensetracker.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(version = 1, entities = [
    TransactionEntity::class
])
@TypeConverters(DateConverter::class)
abstract class ExpenseDatabase : RoomDatabase() {

    abstract fun transactionDao(): TransactionDao

}