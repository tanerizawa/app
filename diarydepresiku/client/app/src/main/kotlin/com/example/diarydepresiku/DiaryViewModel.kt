// DiaryViewModel: Mengelola UI state dan berinteraksi dengan Repository
package com.example.diarydepresiku

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DiaryViewModel(application: Application) : AndroidViewModel(application) {
    // Inisialisasi repository dengan context aplikasi
    private val repository = DiaryRepository(application.applicationContext)

    // Fungsi untuk menyimpan entri diary (dipanggil dari UI)
    fun saveEntry(text: String, mood: String) {
        // Jalankan dalam coroutine IO (agar tidak dijalankan di Main Thread)
        viewModelScope.launch(Dispatchers.IO) {
            repository.addEntry(text, mood)
        }
    }
}
