package np.com.rudichchhantel.data.local.dao

import androidx.room.*
import np.com.rudichchhantel.data.local.entity.Note

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    fun getAllNotes(): List<Note>

    @Insert
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)
}