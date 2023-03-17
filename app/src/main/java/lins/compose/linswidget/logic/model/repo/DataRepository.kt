package lins.compose.linswidget.logic.model.repo

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import lins.compose.linswidget.logic.model.data.Lunar
import lins.compose.linswidget.logic.network.GetService
import lins.compose.linswidget.logic.network.RetrofitIns
import lins.compose.linswidget.logic.network.await

/**
 * @author: Linking.Lin
 * @Date: 2023/3/15 21:33
 * -----------------------------------------------------
 * - Tell me God, are you punishing me?                -
 * - Is this the price I'm paying for my past mistakes -
 * -----------------------------------------------------
 */

//interface DataRepository {
//     val okhttpClient: Any
//     val apiService: Any
//
//    val caleData : CaleData?
//}

class DataRepositoryImp(

){

    suspend fun getData() : Lunar {
            val service = RetrofitIns.instance.create(GetService::class.java)
            return service.getData().await()
    }
}