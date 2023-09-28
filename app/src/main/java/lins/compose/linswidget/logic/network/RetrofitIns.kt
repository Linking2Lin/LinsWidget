package lins.compose.linswidget.logic.network

import lins.compose.linswidget.AppHolder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitIns {
    val instance: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(AppHolder.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun <T> create(serviceClass: Class<T>) : T = instance.create(serviceClass)

    inline fun <reified T> create(): T = create(T::class.java)
}