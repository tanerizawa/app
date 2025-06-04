# main.py: Aplikasi FastAPI dan endpoint-endpoint API
from fastapi import FastAPI, Depends
from sqlalchemy.orm import Session

from . import models, schemas, database
from .database import engine, get_db

# Membuat objek FastAPI
app = FastAPI()

# Membuat tabel di database (jika belum ada)
models.Base.metadata.create_all(bind=engine)

# Endpoint untuk membuat entri diary baru
@app.post("/entries", response_model=schemas.Entry)
def create_entry(entry: schemas.EntryCreate, db: Session = Depends(get_db)):
    # Membuat instance objek ORM untuk entri baru
    db_entry = models.DiaryEntry(text=entry.text, mood=entry.mood, timestamp=entry.timestamp)
    db.add(db_entry)
    db.commit()  # simpan perubahan
    db.refresh(db_entry)  # mengambil data lengkap (termasuk id dari database)
    return db_entry  # akan otomatis dikonversi ke schema Entry (Pydantic)

# Endpoint dummy untuk analisis AI terhadap teks diary
@app.post("/analyze", response_model=schemas.AnalyzeResponse)
def analyze_entry(request: schemas.AnalyzeRequest):
    text = request.text
    # Logika dummy: menentukan analisis berdasar kemunculan kata (hanya contoh placeholder)
    analysis_result = "Mood netral"
    if any(word in text.lower() for word in ["sedih", "marah", "cemas"]):
        analysis_result = "Mood terdeteksi negatif"
    elif any(word in text.lower() for word in ["senang", "bahagia", "gembira"]):
        analysis_result = "Mood terdeteksi positif"
    # Mengembalikan hasil analisis dummy
    return {"analysis": analysis_result}
