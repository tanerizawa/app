# Repository Overview

Diary Depresiku is a mobile diary app with a Python backend. The repository is organized as follows:

- `diarydepresiku/backend` – FastAPI server code.
- `diarydepresiku/client` – Android client built with Kotlin and Jetpack Compose.

## Coding Conventions

### Python
- 4-space indentation, use type hints and docstrings.
- Format with `black` using `--line-length 88`.
- Run `flake8` to check style.

### Kotlin
- Follow typical Jetpack Compose style with 4-space indentation.

## Development Commands

- **Backend**
  ```bash
  pip install -r diarydepresiku/backend/requirements.txt
  uvicorn diarydepresiku.backend.app.main:app --reload
  ```
- **Android client**
  ```bash
  ./gradlew assembleDebug
  ```

## Testing

There are currently no tests. Contributors should add unit tests where feasible.

## Commit Messages

Use a short summary line in present tense, under 60 characters.

## Housekeeping

Update `TODO.md` when tasks are completed.
