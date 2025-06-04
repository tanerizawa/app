# Diary Depresiku 📓💙  
_Aplikasi Mobile Pendamping Kesehatan Mental_

**Diary Depresiku** adalah prototipe Android dengan backend FastAPI untuk mencatat mood harian dan memberi insight berbasis AI. Proyek ini bertujuan membantu pengguna merawat kesehatan mental secara mandiri.

---

## 🚀 Cara Memulai

### 1. Menjalankan Backend
1. Masuk ke direktori `diarydepresiku/backend`.
2. Jalankan `pip install -r requirements.txt` untuk menginstal dependensi.
3. Mulai server dengan perintah `uvicorn app.main:app --reload`.

### 2. Membangun Aplikasi Android
1. Buka Android Studio dan pilih **Open** lalu arahkan ke folder `diarydepresiku/client`.
   Atau jalankan `./gradlew assembleDebug` dari direktori tersebut.
2. Setelah Gradle selesai, jalankan aplikasi di emulator atau perangkat.

### 3. Konfigurasi `ApiConfig.kt`
Ubah nilai `BASE_URL` pada `client/app/src/main/kotlin/com/example/diarydepresiku/ApiConfig.kt` agar sesuai dengan alamat backend.

---

## 🔍 Visi dan Tujuan

> _"Menjadi ruang aman digital bagi pengguna untuk mengenali, merefleksikan, dan merawat kesehatan mental mereka melalui pencatatan harian dan dukungan berbasis AI."_

### Kenapa Diary Depresiku?
- Lebih dari **12 juta** orang di Indonesia mengalami depresi (Riskesdas 2018).
- Akses ke psikolog masih terbatas, terutama karena biaya dan lokasi.
- Menulis jurnal terbukti membantu mengelola stres dan meningkatkan kesejahteraan emosional.

---

## 🧠 Fitur Utama (MVP - Tahun Pertama)

- **Catatan Emosi Harian**: Menulis perasaan dan suasana hati dalam teks bebas & mood tracker.
- **Pelacakan Aktivitas & Lokasi** *(opsional)*: Mengambil data aktivitas & lokasi sebagai konteks emosi.
- **Integrasi Google Fit**: Mengakses langkah harian & detak jantung dari perangkat yang kompatibel.
- **Analisis Emosi AI**: Menggunakan AI (mis. OpenAI API) untuk membaca curhatan dan memberi insight.
- **Rekomendasi Konten**: Artikel, kutipan, latihan pernapasan sesuai dengan suasana hati pengguna.
- **Offline Support**: Bekerja tanpa internet & sinkronisasi otomatis saat online kembali.
- **UI/UX Menenangkan**: Tampilan lembut dan intuitif, dengan warna pastel dan desain minimalis.

---

## 🌱 Fitur Lanjutan (Rencana Tahun Kedua)

- Chat dengan psikolog dan integrasi layanan profesional.
- Insight mood lanjutan, grafik mingguan/bulanan, deteksi pola depresi.
- Rekomendasi konten personal berdasarkan histori emosi.
- Gamifikasi: lencana pencapaian, tantangan refleksi mingguan.
- Keamanan lanjut: login biometrik, enkripsi E2E, compliance HIPAA/PDPL.
- Versi iOS & web (cross-platform, misalnya Flutter).

---

## 🔁 Alur Kerja Pengguna

1. **Buka Aplikasi** → Login/Register akun
2. **Catat Mood & Aktivitas** → tulis curhatan, pilih mood, tambahkan aktivitas/foto
3. **Simpan & Sinkronisasi** → data disimpan lokal dan/atau dikirim ke server
4. **Analisis AI** → AI membaca emosi dan memberi saran konten relevan
5. **Lihat Rekomendasi** → artikel/motivasi/tips relaksasi ditampilkan
6. **Riwayat & Statistik** → pantau mood lewat grafik atau kalender

---

## 🎨 Desain UI/UX

- Warna: biru pastel (`#85C1E9`), hijau mint (`#A3E4D7`), aksen oranye lembut (`#F8C471`)
- Font: **Roboto/Open Sans**, mudah dibaca
- Navigasi: tab bar bawah (Diary, Riwayat, Profil)
- Aksesibilitas: mode gelap, kontras tinggi, font scalable

---

## 🏗️ Arsitektur Teknologi

### Android Client
- Bahasa: **Kotlin**
- Arsitektur: **MVVM + Jetpack Components**
- Penyimpanan lokal: **Room + Encrypted DB**
- Networking: **Retrofit + JWT Auth**
- Sensor: **Google Fit API, Location API**
- Analisis cepat: Sentimen ringan di client (TF Lite)

### Backend Server
- Bahasa: **Python (FastAPI)** atau **Node.js**
- Database: **PostgreSQL / MongoDB**
- AI Integration: **OpenAI GPT-4 API**
- Rekomendasi: Rule-based + AI NLP Suggestion
- API RESTful: autentikasi, entri, analisis, konten
- Keamanan: HTTPS, token auth, enkripsi, audit log

---

## 🤖 AI & Sistem Rekomendasi

- **Emotion Detection** dari teks entri
- **Topik kunci** diidentifikasi (misal "kerja", "kesepian")
- **Saran kontekstual**: "Kamu terlihat stres, cobalah latihan pernapasan ini."
- **Rekomendasi konten AI-aware**: AI memilih artikel dari daftar kurasi
- **Privasi terjaga**: data dianonimkan sebelum dikirim ke AI

---

## 📊 Integrasi Google Fit / Wear OS

- Langkah harian, detak jantung, aktivitas fisik
- Dapat membaca data dari jam tangan Wear OS via Google Fit
- Insight seperti "Anda tidur < 5 jam semalam, mungkin ini memengaruhi mood Anda"
- Semua data hanya diambil jika pengguna memberikan izin (opt-in)

---

## 🧪 Rencana Testing & Launch

### Pengujian
- Unit & Instrumented Test (Espresso, ViewModel logic)
- Beta Internal: pengguna terbatas uji coba selama 2 minggu
- Validasi oleh psikolog: konten & saran sesuai etika
- Penetration testing dasar & load test API

### Peluncuran
- **Q3 Tahun Pertama**: Closed Beta
- **Q4 Tahun Pertama**: Open Beta via Play Store
- **Tahun Kedua**: Versi resmi 1.0 + fitur premium

---

## 🗺️ Roadmap Pengembangan

| Komponen           | Tahun Pertama (MVP)                              | Tahun Kedua (Skala & Monetisasi)                          |
|--------------------|--------------------------------------------------|------------------------------------------------------------|
| Tim                | Solo dev + freelance UI/UX                       | 5–7 orang (dev, AI/ML, QA, psikolog, desain)              |
| Fitur              | Diary, mood form, rekomendasi AI, sinkronisasi   | Chat psikolog, gamifikasi, insight lanjutan, konten premium |
| Teknologi          | Android Kotlin, API FastAPI, PostgreSQL          | Flutter (iOS), Docker/K8s cloud infra, AI custom model    |
| Monetisasi         | Belum (early access gratis)                      | Freemium, B2B corporate wellness, konseling berbayar       |
| Target Pengguna    | 1.000+ pengguna beta                             | 50.000+ pengguna aktif bulanan                            |

---

## 📄 Disclaimer

> Diary Depresiku bukan pengganti konsultasi profesional. Jika Anda mengalami gangguan psikologis serius, hubungi tenaga medis atau layanan kesehatan mental terdekat.

---

## 📬 Kontak & Kontribusi

Tertarik terlibat? Ingin menyumbangkan ide atau menjadi mitra psikolog? Silakan hubungi kami melalui [email@example.com] atau buat issue/pull request di repo ini.

---

## 💡 Lisensi

MIT License © 2025 – Tim Diary Depresiku

