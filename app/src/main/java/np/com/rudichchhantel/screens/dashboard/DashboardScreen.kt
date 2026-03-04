package np.com.rudichchhantel.screens.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import np.com.rudichchhantel.ui.components.AppLayout
import androidx.compose.ui.Modifier

@Composable
fun DashboardScreen(navController: NavController) {

    AppLayout(
        title = "",
        navController = navController,
        showProfile = false
    ) {

        // USERNAME (Top Left)
        Text(
            text = "Rudich Chhantel",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(4.dp))

        // SMALL DASHBOARD LABEL
        Text(
            text = "Dashboard",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Total Users: 3")
                Text("Total Notes: 5")
                Text("Total Reminders: 4")
                Text("Active Reminders: 2")
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { navController.navigate("login") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Logout")
        }
    }
}