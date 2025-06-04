// DiaryEntry: Entitas data untuk satu entri diary (disimpan di Room DB)
package com.example.diarydepresiku

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "entries")
data class DiaryEntry(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "text") val text: String,
    @ColumnInfo(name = "mood") val mood: String,
    @ColumnInfo(name = "timestamp") val timestamp: String
)
