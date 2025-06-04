// DiaryRepository: Menyediakan fungsi untuk menyimpan entri ke database dan mengirim ke server
package com.example.diarydepresiku

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DiaryRepository(context: Context) {
    // Inisialisasi database lokal dan DAO
    private val db = DiaryDatabase.getDatabase(context)
    private val diaryDao = db.diaryDao()

    // Inisialisasi Retrofit untuk API menggunakan base URL dari konfigurasi
    private val retrofit = Retrofit.Builder()
        .baseUrl(ApiConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    private val diaryApi = retrofit.create(DiaryApi::class.java)

    // Fungsi untuk menambahkan entri baru (lokal & remote)
    suspend fun addEntry(text: String, mood: String) {
        // Buat timestamp saat ini (UTC ISO 8601)
        val timestamp = java.time.Instant.now().toString()
        // Buat objek entri baru untuk penyimpanan lokal
        val entry = DiaryEntry(text = text, mood = mood, timestamp = timestamp)
        // Simpan ke database lokal (Room)
        diaryDao.insertEntry(entry)
        // Siapkan data request untuk dikirim ke server
        val request = DiaryEntryRequest(text = text, mood = mood, timestamp = timestamp)
        // Coba kirim ke server melalui API
        try {
            val response = diaryApi.postEntry(request)
            // Mengecek apakah respons sukses (kode HTTP 200-299)
            if (response.isSuccessful) {
                // Berhasil mengirim ke server (bisa tambahkan log atau aksi lanjutan)
                val responseBody = response.body()
                // Misalnya, responseBody?.id bisa digunakan untuk update status terkirim di lokal
            } else {
                // Gagal (error dari server), bisa menandai entri untuk dikirim ulang nanti
            }
        } catch (e: Exception) {
            // Exception saat mengirim (misal tidak ada koneksi internet)
            // Catat atau tangani kesalahan sesuai kebutuhan (mis. jadwalkan ulang pengiriman).
        }
    }
}
