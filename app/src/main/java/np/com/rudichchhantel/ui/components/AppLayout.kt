package np.com.rudichchhantel.ui.components

import androidx.compose.foundation.layout.*
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
    content: @Composable () -> Unit
) {

    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Text(text = title)
                }
            )
        },

        bottomBar = {
            NavigationBar {

                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("dashboard") },
                    label = { Text("Dashboard") },
                    icon = { }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("notes") },
                    label = { Text("Notes") },
                    icon = { }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("reminder") },
                    label = { Text("Reminder") },
                    icon = { }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("active") },
                    label = { Text("Active") },
                    icon = { }
                )
            }
        }

    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            content()
        }
    }
}