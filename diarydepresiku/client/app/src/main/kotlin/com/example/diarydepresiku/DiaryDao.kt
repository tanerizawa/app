// DiaryDao: DAO untuk mengakses data DiaryEntry di database
package com.example.diarydepresiku

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DiaryDao {
    // Menyimpan entri diary baru ke database lokal
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEntry(entry: DiaryEntry)

    // (Opsional) Query untuk mendapatkan semua entri atau entri tertentu
    @Query("SELECT * FROM entries")
    suspend fun getAllEntries(): List<DiaryEntry>
}
