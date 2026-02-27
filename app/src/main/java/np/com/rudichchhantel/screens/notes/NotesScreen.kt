package np.com.rudichchhantel.screens.notes

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import np.com.rudichchhantel.ui.components.AppLayout
import androidx.compose.ui.Modifier

@Composable
fun NotesScreen(navController: NavController) {

    AppLayout(title = "Notes", navController = navController) {

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Meeting Notes")
                Text("Discuss project timeline")
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Shopping List")
                Text("Milk, Bread, Eggs")
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Ideas")
                Text("Build reminder app UI")
            }
        }
    }
}