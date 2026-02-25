package np.com.rudichchhantel.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import np.com.rudichchhantel.screens.login.LoginScreen
import np.com.rudichchhantel.screens.dashboard.DashboardScreen
import np.com.rudichchhantel.screens.notes.NotesScreen
import np.com.rudichchhantel.screens.reminder.ReminderScreen
import np.com.rudichchhantel.screens.active.ActiveReminderScreen

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            LoginScreen(navController)
        }

        composable("dashboard") {
            DashboardScreen(navController)
        }

        composable("notes") {
            NotesScreen(navController)
        }

        composable("reminder") {
            ReminderScreen(navController)
        }

        composable("active") {
            ActiveReminderScreen(navController)
        }
    }
}