package np.com.rudichchhantel.screens.reminder

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import np.com.rudichchhantel.ui.components.AppLayout
import androidx.compose.ui.Modifier

@Composable
fun ReminderScreen(navController: NavController) {

    AppLayout(title = "Reminders", navController = navController) {

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Doctor Appointment")
                Text("Date: 25 Feb 2026")
                Text("Time: 10:00 AM")
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Submit Assignment")
                Text("Date: 28 Feb 2026")
                Text("Time: 5:00 PM")
            }
        }
    }
}