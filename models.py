# models.py: Definisi model ORM untuk tabel diary entries
from sqlalchemy import Column, Integer, String
from .database import Base

# ORM model untuk entri diary
class DiaryEntry(Base):
    __tablename__ = "entries"
    
    id = Column(Integer, primary_key=True, index=True)
    text = Column(String, nullable=False)
    mood = Column(String, nullable=False)
    timestamp = Column(String, nullable=False)
