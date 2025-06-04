# schemas.py: Definisi Pydantic model untuk request dan response API
from pydantic import BaseModel

# Schema dasar untuk entri diary (digunakan sebagai base class)
class EntryBase(BaseModel):
    text: str
    mood: str
    timestamp: str

# Schema untuk pembuatan entri (dikirim client, tanpa id)
class EntryCreate(EntryBase):
    pass  # semua field sama dengan EntryBase

# Schema untuk output entri (dikembalikan ke client, termasuk id)
class Entry(EntryBase):
    id: int
    class Config:
        orm_mode = True  # memungkinkan pengembalian ORM model langsung

# Schema untuk permintaan analisis AI (dummy)
class AnalyzeRequest(BaseModel):
    text: str

# Schema untuk respons analisis AI (dummy)
class AnalyzeResponse(BaseModel):
    analysis: str
