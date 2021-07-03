package com.ismail.creatvt.expensetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ismail.creatvt.expensetracker.database.TransactionEntity
import kotlinx.android.synthetic.main.activity_add_transaction.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*

class AddTransactionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_transaction)


        done_button.setOnClickListener {
            val title = title_field.text.toString()
            val amount = amount_field.text.toString().toFloatOrNull()

            if(title.isNullOrEmpty()){
                title_layout.error = "Please enter transaction title"
                return@setOnClickListener
            }
            title_layout.error = null

            if(amount == null || amount <= 0){
                amount_layout.error = "Amount is invalid"
                return@setOnClickListener
            }
            amount_layout.error = null

            // The Form is Valid
            // Insert the Transaction in the database
            val db = getDatabase(this)

            val dao = db.transactionDao()

            CoroutineScope(IO).launch {
                dao.insert(
                    TransactionEntity(
                        0,
                        title,
                        amount,
                        Date(),
                        true
                    )
                )
                withContext(Main){
                    finish()
                }
            }

        }
    }
}