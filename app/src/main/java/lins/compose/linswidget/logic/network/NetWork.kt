package lins.compose.linswidget.logic.network

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.RuntimeException
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * @author: Linking.Lin
 * @Date: 2023/3/16 9:54
 * -----------------------------------------------------
 * - Tell me God, are you punishing me?                -
 * - Is this the price I'm paying for my past mistakes -
 * -----------------------------------------------------
 */
private const val TAG = "NetWork"
suspend fun <T> Call<T>.await() : T {
    return suspendCoroutine<T> {
        enqueue(object : Callback<T> {
            override fun onResponse(call: Call<T>, response: Response<T>) {
                val body = response.body()
                Log.d(TAG, "onResponse: ${response.body().toString()}")
                if (body != null) {
                    it.resume(body)
                } else {
                    it.resumeWithException(
                        RuntimeException("REPONSE BODY IS NULL")
                    )
                }
            }

            override fun onFailure(call: Call<T>, t: Throwable) {
                it.resumeWithException(t)
            }

        })
    }
}