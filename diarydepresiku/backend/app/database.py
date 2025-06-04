# database.py: Inisialisasi koneksi database dan session SQLAlchemy
from sqlalchemy import create_engine
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import sessionmaker

# Buat engine SQLite (file database lokal)
engine = create_engine("sqlite:///diary.db", connect_args={"check_same_thread": False})
# Catatan: check_same_thread=False diperlukan untuk SQLite di thread berbeda

# Membuat Base class ORM untuk deklarasi model
Base = declarative_base()

# SessionLocal akan digunakan untuk membuat sesi database per request
SessionLocal = sessionmaker(autocommit=False, autoflush=False, bind=engine)

# Dependency: fungsi untuk mendapatkan session database (digunakan di FastAPI)
def get_db():
    db = SessionLocal()
    try:
        yield db
    finally:
        db.close()
