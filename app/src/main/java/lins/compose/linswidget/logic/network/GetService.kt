package lins.compose.linswidget.logic.network

import lins.compose.linswidget.AppHolder
import lins.compose.linswidget.logic.model.data.Lunar
import retrofit2.Call
import retrofit2.http.GET

interface GetService {
    @GET("lunar?token=${AppHolder.token}")
    fun getData() : Call<Lunar>
}