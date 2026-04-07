package np.com.rudichchhantel.data.local.dao

import androidx.room.*
import np.com.rudichchhantel.data.local.entity.Reminder

@Dao
interface ReminderDao {

    @Query("SELECT * FROM reminders")
    fun getAllReminders(): List<Reminder>

    @Insert
    fun insert(reminder: Reminder)

    @Update
    fun update(reminder: Reminder)

    @Delete
    fun delete(reminder: Reminder)
}