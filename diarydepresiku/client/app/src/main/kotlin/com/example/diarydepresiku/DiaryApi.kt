// DiaryApi: Interface Retrofit untuk berkomunikasi dengan backend FastAPI
package com.example.diarydepresiku

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

// Data class untuk body permintaan POST entri diary ke server
data class DiaryEntryRequest(val text: String, val mood: String, val timestamp: String)
// Data class untuk respons dari server setelah menyimpan entri
data class DiaryEntryResponse(val id: Int, val text: String, val mood: String, val timestamp: String)

interface DiaryApi {
    // Endpoint untuk mengirim entri diary baru ke server
    @POST("/entries")
    suspend fun postEntry(@Body entry: DiaryEntryRequest): Response<DiaryEntryResponse>

    // (Opsional) Endpoint lain dapat didefinisikan, misalnya untuk analisis atau mendapatkan daftar entri
}
