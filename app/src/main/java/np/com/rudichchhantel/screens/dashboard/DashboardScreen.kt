package np.com.rudichchhantel.screens.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DashboardScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        Text("Dashboard", style = MaterialTheme.typography.headlineMedium)

        Button(
            onClick = { navController.navigate("notes") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Go to Notes")
        }

        Button(
            onClick = { navController.navigate("reminder") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Go to Reminder")
        }

        Button(
            onClick = { navController.navigate("active") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Active Reminders")
        }

        Button(
            onClick = { navController.navigate("login") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Logout")
        }
    }
}