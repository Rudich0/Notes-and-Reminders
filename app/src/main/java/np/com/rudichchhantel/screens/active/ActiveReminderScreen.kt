package np.com.rudichchhantel.screens.active

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import np.com.rudichchhantel.ui.components.AppLayout
import androidx.compose.ui.Modifier

@Composable
fun ActiveReminderScreen(navController: NavController) {

    AppLayout(title = "Active Reminders", navController = navController) {

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Doctor Appointment")
                Text("Active")
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Gym Session")
                Text("Active")
            }
        }
    }
}