from sqlalchemy.orm import Session

from . import models


class DiaryDao:
    """Data access object for DiaryEntry operations."""

    @staticmethod
    def getAllEntries(db: Session):
        """Return all diary entries from the database."""
        return db.query(models.DiaryEntry).all()
