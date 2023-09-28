package lins.compose.linswidget.logic.model.repo

import lins.compose.linswidget.logic.model.data.Lunar
import lins.compose.linswidget.logic.network.GetService
import lins.compose.linswidget.logic.network.RetrofitIns
import lins.compose.linswidget.logic.network.await
import javax.inject.Inject

/**
 * @author: Linking.Lin
 * @Date: 2023/3/15 21:33
 * -----------------------------------------------------
 * - Tell me God, are you punishing me?                -
 * - Is this the price I'm paying for my past mistakes -
 * -----------------------------------------------------
 */

class DataRepositoryImp @Inject constructor(
    private val service: GetService = RetrofitIns.instance.create(GetService::class.java)
) {
    suspend fun getData(): Lunar {
        return service.getData().await()
    }
}