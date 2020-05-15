package com.canh.data.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.canh.data.local.db.dao.NoteDao
import com.canh.data.model.NoteEntity

fun createNoteDao(context: Context) = createAppDao(context).noteDao()

fun createAppDao(context: Context) =
    Room.databaseBuilder(context, AppDatabase::class.java, "app_db").allowMainThreadQueries().build()

@Database(entities = [NoteEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}
