package com.ismail.creatvt.expensetracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.ismail.creatvt.expensetracker.database.ExpenseDatabase
import com.ismail.creatvt.expensetracker.database.TransactionEntity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add_transaction.setOnClickListener {
            startActivity(Intent(this, AddTransactionActivity::class.java))
        }
        
    }
}