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

    AppLayout(title = "Dashboard", navController = navController) {

        Text("Total Users: 3")
        Spacer(modifier = Modifier.height(10.dp))

        Text("Total Notes: 5")
        Spacer(modifier = Modifier.height(10.dp))

        Text("Total Reminders: 4")
        Spacer(modifier = Modifier.height(10.dp))

        Text("Active Reminders: 2")
    }
}