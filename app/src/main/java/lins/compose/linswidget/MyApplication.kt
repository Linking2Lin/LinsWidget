package lins.compose.linswidget

import android.app.Application
import android.os.Process
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import kotlin.math.log

/**
 * @author: Linking.Lin
 * @Date: 2023/3/17 9:42
 * -----------------------------------------------------
 * - Tell me God, are you punishing me?                -
 * - Is this the price I'm paying for my past mistakes -
 * -----------------------------------------------------
 */
private const val TAG = "MyApplication"

@HiltAndroidApp
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate: ${Process.myPid()}")
    }
}