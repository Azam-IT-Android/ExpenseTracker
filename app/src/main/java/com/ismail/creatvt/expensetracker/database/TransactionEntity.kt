package com.ismail.creatvt.expensetracker.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
class TransactionEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var title: String,
    var amount:Float,
    var date: Date,
    var isIncome: Boolean
)