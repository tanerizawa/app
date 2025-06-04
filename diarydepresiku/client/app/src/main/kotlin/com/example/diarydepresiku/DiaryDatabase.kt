// DiaryDatabase: Kelas Room Database untuk aplikasi
package com.example.diarydepresiku

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DiaryEntry::class], version = 1, exportSchema = false)
abstract class DiaryDatabase : RoomDatabase() {
    abstract fun diaryDao(): DiaryDao

    companion object {
        @Volatile private var INSTANCE: DiaryDatabase? = null

        // Mendapatkan instance Database (singleton)
        fun getDatabase(context: Context): DiaryDatabase {
            // Jika instance belum ada, buat baru secara synchronized
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DiaryDatabase::class.java,
                    "diary_db" // nama file database lokal
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
