package com.ismail.creatvt.expensetracker.database

import androidx.room.*

@Dao
interface TransactionDao {

    @Insert
    fun insert(entity: TransactionEntity)

    @Insert
    fun insertAll(entities: List<TransactionEntity>)

    @Update
    fun update(entity: TransactionEntity)

    @Delete
    fun delete(entity: TransactionEntity)

    @Query("select * from transactionentity")
    fun getAllTransaction():List<TransactionEntity>

}