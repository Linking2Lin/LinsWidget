package lins.compose.linswidget.glance.demo.ui.theme

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.text.Text
import lins.compose.linswidget.MainActivity

class MyAppWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget
        get() = MyAppWidget()
}

class MyAppWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            Column {
                Text("HHH")
                Button(
                    text = "HHH",
                    onClick = actionStartActivity<MainActivity>()
                )
            }
        }
    }

}
