package np.com.rudichchhantel.data.repository

import np.com.rudichchhantel.data.local.dao.NoteDao
import np.com.rudichchhantel.data.local.entity.Note

class NoteRepository(private val noteDao: NoteDao) {

    fun getNotes() = noteDao.getAllNotes()

    fun insert(note: Note) = noteDao.insert(note)

    fun delete(note: Note) = noteDao.delete(note)
}