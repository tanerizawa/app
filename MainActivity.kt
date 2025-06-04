// MainActivity: Activity utama aplikasi
package com.example.diarydepresiku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Mengatur konten UI menggunakan Jetpack Compose
        setContent {
            // Mengambil instance ViewModel untuk mengelola data
            val diaryViewModel: DiaryViewModel = viewModel()
            // Memanggil fungsi composable utama untuk UI aplikasi
            DiaryFormScreen(viewModel = diaryViewModel)
        }
    }
}

// Daftar pilihan mood yang tersedia
val moodOptions = listOf("Senang", "Sedih", "Cemas", "Marah")

@Composable
fun DiaryFormScreen(viewModel: DiaryViewModel) {
    // State untuk input teks diary
    val diaryText = remember { mutableStateOf("") }
    // State untuk pilihan mood (default ke mood pertama)
    val selectedMood = remember { mutableStateOf(moodOptions[0]) }

    // UI disusun secara vertikal (Column)
    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        // Input teks untuk isi diary
        OutlinedTextField(
            value = diaryText.value,
            onValueChange = { diaryText.value = it },
            label = { Text("Isi Diary") },
            modifier = Modifier.fillMaxWidth(),
            maxLines = 5 // Membatasi hingga 5 baris (bisa untuk teks panjang)
        )

        // Pilihan mood menggunakan RadioButton
        Text(text = "Mood:", style = MaterialTheme.typography.body1)
        // Menampilkan setiap mood sebagai opsi yang bisa dipilih
        moodOptions.forEach { mood ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = (mood == selectedMood.value),
                    onClick = { selectedMood.value = mood }
                )
                // Label teks untuk RadioButton, bisa diklik untuk memilih opsi
                Text(text = mood, modifier = Modifier
                    .padding(start = 8.dp)
                    .clickable { selectedMood.value = mood }
                )
            }
        }

        // Tombol Simpan untuk menyimpan entri diary
        Button(onClick = {
            // Memanggil fungsi di ViewModel untuk menyimpan entri
            viewModel.saveEntry(diaryText.value, selectedMood.value)
            // Membersihkan input setelah menyimpan
            diaryText.value = ""
            selectedMood.value = moodOptions[0]
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Simpan")
        }
    }
}
