package np.com.rudichchhantel.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val DarkColors = darkColorScheme(
    primary = YellowAccent,
    secondary = LightYellow,
    background = DarkGray,
    surface = BlackPrimary,
    onPrimary = BlackPrimary,
    onBackground = WhiteText,
    onSurface = WhiteText
)

@Composable
fun NotesandRemindersTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColors,
        typography = Typography(),
        content = content
    )
}