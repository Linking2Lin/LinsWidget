package lins.compose.linswidget.activitis

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import lins.compose.linswidget.activitis.ui.theme.LinsWidgetTheme
import lins.compose.linswidget.others.Mm

private const val TAG = "IPC2Activity"
class IPC2Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LinsWidgetTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2(this.toString())
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    LaunchedEffect(key1 = 1, block = {
        Log.d(TAG, "Greeting: ${Mm.id}")
        Log.d(TAG, "Greeting: ${Mm.hashCode()}")
    })
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    LinsWidgetTheme {
        Greeting2("Android")
    }
}