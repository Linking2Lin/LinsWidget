package lins.compose.linswidget.activitis

import android.content.Intent
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import lins.compose.linswidget.activitis.ui.theme.LinsWidgetTheme
import lins.compose.linswidget.others.Mm
import kotlin.math.log

private const val TAG = "IPC1Activity"

class IPC1Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LinsWidgetTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(this.toString())
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    LaunchedEffect(key1 = 1) {
        Mm.id = 100
        Log.d(TAG, "Greeting: ${Mm.id}")
        Log.d(TAG, "Greeting: ${Mm.hashCode()}")
        delay(2000)
        context.startActivity(Intent(context,IPC2Activity::class.java))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LinsWidgetTheme {
        Greeting("Android")
    }
}