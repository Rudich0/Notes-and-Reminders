package np.com.rudichchhantel.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppLayout(
    title: String,
    navController: NavController,
    showProfile: Boolean = false,
    showFab: Boolean = false,
    content: @Composable () -> Unit
) {

    Scaffold(

        topBar = {
            TopAppBar(
                title = { Text(title) },
                actions = {

                    // Show profile icon on all pages except dashboard
                    if (title != "Dashboard") {
                        IconButton(
                            onClick = { navController.navigate("dashboard") }
                        ) {
                            Icon(
                                imageVector = Icons.Default.AccountCircle,
                                contentDescription = "Profile"
                            )
                        }
                    }
                }
            )
        },

        floatingActionButton = {
            if (showFab) {
                FloatingActionButton(onClick = { }) {
                    Text("+")
                }
            }
        },

        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("notes") },
                    label = { Text("Notes") },
                    icon = {}
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("reminder") },
                    label = { Text("Reminder") },
                    icon = {}
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("active") },
                    label = { Text("Active") },
                    icon = {}
                )
            }
        }

    ) { padding ->

        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            content()
        }
    }
}