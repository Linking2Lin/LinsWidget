package lins.compose.linswidget.ui.widget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.view.ViewGroup.LayoutParams
import android.widget.RemoteViews
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import lins.compose.linswidget.R
import lins.compose.linswidget.ui.theme.LinsWidgetTheme

/**
 * Implementation of App Widget functionality.
 */
class LinsCalendarWidget : AppWidgetProvider() {

    lateinit var myView: BrageView

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        Log.d(TAG, "onUpdate: ")
        // There may be multiple widgets active, so update all of them
        for (appWidgetId in appWidgetIds) {
            if (!::myView.isInitialized) {
                myView = BrageView(context.applicationContext)
            }
            updateAppWidget(context, appWidgetManager, appWidgetId, myView = myView)
        }
    }

    override fun onEnabled(context: Context) {
        Log.d(TAG, "onEnabled: ${context.packageName}")
        // Enter relevant functionality for when the first widget is created
        myView = BrageView(context.applicationContext)
    }

    override fun onDisabled(context: Context) {
        // Enter relevant functionality for when the last widget is disabled
        Log.d(TAG, "onEnabled: ${context.packageName}")
    }


}

internal fun updateAppWidget(context: Context, appWidgetManager: AppWidgetManager, appWidgetId: Int, myView: BrageView) {
    // 将View转为ImageView然后BitMap然后添加

//    val widgetText = context.getString(R.string.appwidget_text)
//    // Construct the RemoteViews object
//    val views = RemoteViews(context.packageName, R.layout.lins_calendar_widget)
//    views.setTextViewText(R.id.appwidget_text, widgetText)

//    myView.apply {
//        //measure(500,500)
//        //layout(0,0,500,500)
////        height = LayoutParams.MATCH_PARENT
////        width = LayoutParams.MATCH_PARENT
//    }
    val bitmap = Bitmap.createBitmap(500,500,Bitmap.Config.ARGB_8888)
//    val bitmap = BitmapFactory.decodeResource(context.applicationContext.resources, R.drawable.blackhole)
//    val canvas = Canvas(bitmap)
//    canvas.drawBitmap(bitmap,0f,0f,null)
    myView.draw(Canvas(bitmap))

    val views = RemoteViews(context.packageName, R.layout.lins_calendar_widget)
    views.setImageViewBitmap(R.id.widget_ImagView,bitmap)


    Log.d(TAG, "updateAppWidget: ")
    // Instruct the widget manager to update the widget
    appWidgetManager.updateAppWidget(appWidgetId, views)
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LinsCal() {
    Image(
        painter = painterResource(R.drawable.blackhole),
        modifier = Modifier.fillMaxSize(),
        contentDescription = null,
        alignment = Alignment.TopStart
    )
//    Text(
//        text = "HHH"
//    )
}



class BrageView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : AbstractComposeView(context, attrs, defStyle)
{
    @Composable
    override fun Content() {
        LinsWidgetTheme {
            LinsCal()
        }
    }

}

private const val TAG = "LinsCalendarWidget"

