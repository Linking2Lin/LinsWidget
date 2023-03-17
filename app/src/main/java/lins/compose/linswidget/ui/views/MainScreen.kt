package lins.compose.linswidget.ui.views

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import lins.compose.linswidget.ui.viewmodels.MainViewModel

/**
 * @author: Linking.Lin
 * @Date: 2023/3/15 21:10
 * -----------------------------------------------------
 * - Tell me God, are you punishing me?                -
 * - Is this the price I'm paying for my past mistakes -
 * -----------------------------------------------------
 */

@Composable
fun MainScreen(model: MainViewModel) {
    val datas = model.caleData.collectAsStateWithLifecycle()
    Column {
        Text(
            text = "阳历日期",
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(10.dp))
        Text(
            text = "农历日期",
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(10.dp))
        Button(
            onClick = {
                model.queryCalenDate()
                Log.d(TAG, "MainScreen: ${datas.value?.data.toString()}")
            },

            ){
            Text(text = "查询")
        }
        Text(
            text = datas.value?.data.toString()
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MainPre() {

}

private const val TAG = "MainScreen"