package com.ismail.creatvt.expensetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.ismail.creatvt.expensetracker.database.ExpenseDatabase
import com.ismail.creatvt.expensetracker.database.TransactionEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 1: Get the database object to connect with the db
        val db = getDatabase(this)

        // Step 2: Get the Dao object to perform Insert/Update/Delete Operations on the Database
        val dao = db.transactionDao()

        
    }
}