package lins.compose.linswidget.ui.widget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.view.ViewGroup.LayoutParams
import android.widget.RemoteViews
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import lins.compose.linswidget.R
import lins.compose.linswidget.ui.BrageView
import lins.compose.linswidget.ui.theme.LinsWidgetTheme

/**
 * Implementation of App Widget functionality.
 */
class LinsCalendarWidget : AppWidgetProvider() {

    //private lateinit var myView: BrageView

    // 每次更新时调用
    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        Log.d(TAG, "onUpdate: ")
        // There may be multiple widgets active, so update all of them
//        for (appWidgetId in appWidgetIds) {
//            if (!::myView.isInitialized) {
//                myView = BrageView(context.applicationContext)
//            }
//            updateAppWidget(context, appWidgetManager, appWidgetId, myView = myView)
//        }
        val views = RemoteViews(
            context.packageName,
            R.layout.lins_calendar_widget
        )

        appWidgetManager.updateAppWidget(appWidgetIds,views)
    }

    // 当第一次被添加到桌面时调用
    override fun onEnabled(context: Context) {
//        Log.d(TAG, "onEnabled: ${context.packageName}")
//        // Enter relevant functionality for when the first widget is created
//        myView = BrageView(context.applicationContext)
    }

    // 最后一个该类型的小组件被删除时调用
    override fun onDisabled(context: Context) {
        // Enter relevant functionality for when the last widget is disabled
        Log.d(TAG, "onEnabled: ${context.packageName}")
    }

    // 每删除一次小组件调用一次
    override fun onDeleted(context: Context?, appWidgetIds: IntArray?) {
        super.onDeleted(context, appWidgetIds)
    }

    // 广播内置方法，用来方法具体事件
    override fun onReceive(context: Context?, intent: Intent?) {
        super.onReceive(context, intent)
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
//    Log.d(TAG, "updateAppWidget: W/H ${myView.width}   ${myView.height}")
//    Log.d(TAG, "updateAppWidget: MW/MH ${myView.measuredWidth}   ${myView.measuredHeight}")
//    val bitmap = Bitmap.createBitmap(
//        if (myView.width == 0) 100 else
//        myView.width,
//        if (myView.height == 0) 100 else
//        myView.height,
//        Bitmap.Config.ARGB_8888
//    )
//    val canvas = Canvas(bitmap)
//    myView.draw(canvas)
////    val bitmap = BitmapFactory.decodeResource(context.applicationContext.resources, R.drawable.blackhole)
////    val canvas = Canvas(bitmap)
////    canvas.drawBitmap(bitmap,0f,0f,null)
//    Log.d(TAG, "updateAppWidget: $canvas")
//
//
//
//    val views = RemoteViews(context.packageName, R.layout.lins_calendar_widget)
//    views.setImageViewBitmap(R.id.widget_ImagView,bitmap)
//
//
//    Log.d(TAG, "updateAppWidget: ")
//    // Instruct the widget manager to update the widget
//    appWidgetManager.updateAppWidget(appWidgetId, views)
}


private const val TAG = "LinsCalendarWidget"

