package np.com.rudichchhantel.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import np.com.rudichchhantel.data.local.dao.NoteDao
import np.com.rudichchhantel.data.local.dao.ReminderDao
import np.com.rudichchhantel.data.local.entity.Note
import np.com.rudichchhantel.data.local.entity.Reminder

@Database(
    entities = [Note::class, Reminder::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
    abstract fun reminderDao(): ReminderDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_db"
                )
                    .allowMainThreadQueries()   // ⚠️ TEMP (for now)
                    .build()

                INSTANCE = instance
                instance
            }
        }
    }
}