
import android.graphics.drawable.Icon
import androidx.compose.foundation.border
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBarCompose() {
   TopAppBar(
       modifier = Modifier.border(width = 0.dp, color = Color.Transparent),
       title = { Text(text = "Affirmations", style = MaterialTheme.typography.subtitle1) },
       elevation = 0.dp,
       navigationIcon = { IconButton(onClick = { }) {
          Icon(Icons.Default.Menu, contentDescription = "Menu")
       }
                        },
       actions = {
                 IconButton(onClick = { /*TODO*/ }) {
                     Icon(Icons.Default.Search, contentDescription = "Search")
                 }
       },

       )
}
