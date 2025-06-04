# Diary Depresiku 📓💙

**Aplikasi Pendamping Kesehatan Mental Berbasis AI**

**Diary Depresiku** adalah prototipe aplikasi Android dengan backend FastAPI yang memungkinkan pengguna mencatat suasana hati harian serta mendapatkan wawasan (insight) berbasis kecerdasan buatan (AI). Proyek ini dirancang untuk mendukung pengguna dalam merawat kesehatan mental secara mandiri.

---

## 🚀 Cara Memulai

### 1. Menjalankan Backend

```bash
cd diarydepresiku/backend
pip install -r requirements.txt
uvicorn app.main:app --reload
```

### 2. Membangun Aplikasi Android

* **Menggunakan Android Studio**:

  * Pilih **Open** dan buka folder `diarydepresiku/client`.
  * Tekan tombol Run untuk menjalankan aplikasi pada emulator atau perangkat fisik.

* **Menggunakan Command Line**:

```bash
cd diarydepresiku/client
./gradlew assembleDebug
```

### 3. Konfigurasi `ApiConfig.kt`

Sesuaikan nilai `BASE_URL` di:

```bash
client/app/src/main/kotlin/com/example/diarydepresiku/ApiConfig.kt
```

---

## 🌟 Visi dan Misi

> *Menjadi ruang digital yang aman bagi pengguna untuk mengenali, merefleksikan, dan merawat kesehatan mental secara mandiri melalui dukungan teknologi AI.*

### Mengapa Diary Depresiku?

* Lebih dari **12 juta** penduduk Indonesia mengalami depresi (Riskesdas 2018).
* Akses terbatas ke layanan kesehatan mental profesional.
* Menulis jurnal terbukti efektif dalam meningkatkan kesejahteraan emosional.

---

## 🧠 Fitur Utama (MVP - Tahun Pertama)

* **Catatan Harian**: Input mood, catatan pribadi, dan aktivitas.
* **Integrasi Google Fit**: Pelacakan aktivitas fisik dan detak jantung.
* **Analisis Emosi Berbasis AI**: Membaca emosi dari teks dan memberikan insight.
* **Rekomendasi Konten Personal**: Artikel, motivasi, dan latihan relaksasi sesuai mood.
* **Offline Support**: Fungsi offline dengan sinkronisasi otomatis.
* **UI/UX Menenangkan**: Desain lembut dan intuitif, menggunakan warna pastel minimalis.

---

## 🌱 Fitur Lanjutan (Tahun Kedua)

* Chat langsung dengan psikolog.
* Grafik analisis emosi mingguan/bulanan.
* Gamifikasi: tantangan mingguan dan lencana.
* Keamanan tingkat lanjut: biometrik dan enkripsi.
* Versi lintas platform: iOS dan web menggunakan Flutter.

---

## 🔄 Alur Pengguna

1. **Login/Daftar** → akses aplikasi
2. **Tulis Catatan Harian** → input mood dan aktivitas
3. **Sinkronisasi Data** → lokal & server cloud
4. **Analisis AI** → insight otomatis
5. **Rekomendasi Konten** → artikel dan tips personal
6. **Monitoring Mood** → grafik emosi dan statistik

---

## 🎨 Panduan Desain UI/UX

* **Warna**: Biru pastel (`#85C1E9`), hijau mint (`#A3E4D7`), oranye lembut (`#F8C471`)
* **Tipografi**: Roboto & Open Sans
* **Navigasi**: Bottom navigation (Diary, Riwayat, Profil)
* **Aksesibilitas**: Mode gelap, font scalable, kontras tinggi

---

## ⚙️ Arsitektur Teknologi

### Client (Android)

* Bahasa: Kotlin
* Arsitektur: MVVM + Jetpack Components
* Penyimpanan: Room + Encrypted DB
* Networking: Retrofit + JWT Auth
* Sensor: Google Fit & Location API
* Analisis Emosi Ringan: TensorFlow Lite

### Backend (FastAPI)

* Bahasa: Python
* Database: PostgreSQL/MongoDB
* Integrasi AI: OpenAI GPT-4 API
* Keamanan: HTTPS, Token Auth, Audit Log

---

## 🤖 Kecerdasan Buatan & Rekomendasi

* Deteksi emosi dari catatan teks
* Identifikasi topik dan kondisi mood
* Rekomendasi konten berdasarkan analisis teks
* Privasi pengguna terjamin dengan data anonim

---

## 📊 Integrasi Google Fit & Wear OS

* Data aktivitas fisik & kesehatan
* Insight korelatif seperti pengaruh tidur pada mood
* Data hanya diambil jika disetujui pengguna

---

## 🧪 Rencana Testing & Peluncuran

### Pengujian

* Unit & Instrumented Testing
* Internal Beta: Pengujian tertutup
* Validasi konten oleh psikolog
* Keamanan: Penetrasi dasar & load test API

### Peluncuran

* **Q3 Tahun Pertama**: Closed Beta
* **Q4 Tahun Pertama**: Open Beta di Google Play
* **Tahun Kedua**: Versi penuh & monetisasi premium

---

## 🗺️ Roadmap Pengembangan

| Komponen        | Tahun Pertama (MVP)                    | Tahun Kedua (Pertumbuhan & Monetisasi)          |
| --------------- | -------------------------------------- | ----------------------------------------------- |
| Tim             | Solo developer & freelancer UI/UX      | Tim 5-7 (Developer, AI, QA, Psikolog, Desainer) |
| Fitur           | Diary, Insight AI, Google Fit, Offline | Psikolog online, Gamifikasi, Konten Premium     |
| Teknologi       | Android Kotlin, FastAPI, PostgreSQL    | Flutter, Docker/Kubernetes, Custom AI           |
| Monetisasi      | Early access gratis                    | Freemium, B2B wellness, Konseling berbayar      |
| Target Pengguna | 1.000+ pengguna beta                   | 50.000+ pengguna aktif                          |

---

## ⚠️ Disclaimer

Diary Depresiku bukan pengganti bantuan profesional. Jika Anda mengalami masalah serius, segera hubungi tenaga kesehatan mental profesional.

---

## 📬 Kontak & Kontribusi

Tertarik berkontribusi atau bekerja sama? Hubungi kami di \[[studiomalaka@gmail.com](mailto:studiomalaka@gmail.com)] atau buat issue/pull request di repo ini.

---

## 📜 Lisensi

Diary Depresiku © 2025, dilisensikan di bawah [MIT License](LICENSE).
