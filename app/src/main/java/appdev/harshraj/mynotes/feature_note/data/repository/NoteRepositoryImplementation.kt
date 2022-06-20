package appdev.harshraj.mynotes.feature_note.data.repository

import appdev.harshraj.mynotes.feature_note.data.data_source.NoteDao
import appdev.harshraj.mynotes.feature_note.domain.model.Note
import appdev.harshraj.mynotes.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImplementation(
    private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNodeById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}
