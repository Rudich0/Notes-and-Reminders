package np.com.rudichchhantel.data.repository

import np.com.rudichchhantel.data.local.dao.ReminderDao
import np.com.rudichchhantel.data.local.entity.Reminder

class ReminderRepository(private val reminderDao: ReminderDao) {

    fun getReminders() = reminderDao.getAllReminders()

    fun insert(reminder: Reminder) = reminderDao.insert(reminder)
}