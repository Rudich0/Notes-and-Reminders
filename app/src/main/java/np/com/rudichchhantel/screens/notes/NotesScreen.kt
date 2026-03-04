package np.com.rudichchhantel.screens.notes

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import np.com.rudichchhantel.ui.components.AppLayout
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit

@Composable
fun NotesScreen(navController: NavController) {

    AppLayout(
        title = "Notes",
        navController = navController,
        showFab = true
    ) {

        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text("Buy Groceries")
                    Text("Milk, Eggs, Bread")
                }

                Icon(
                    Icons.Default.Edit,
                    contentDescription = "Edit"
                )
            }
        }
    }
}