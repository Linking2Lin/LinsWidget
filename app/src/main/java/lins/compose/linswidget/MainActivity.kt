package lins.compose.linswidget

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import lins.compose.linswidget.logic.model.repo.DataRepositoryImp
import lins.compose.linswidget.ui.theme.LinsWidgetTheme
import lins.compose.linswidget.ui.viewmodels.MainViewModel
import lins.compose.linswidget.ui.views.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LinsWidgetTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    val model = MainViewModel(DataRepositoryImp())
                    MainScreen(model)
                }
            }
        }
    }
}



