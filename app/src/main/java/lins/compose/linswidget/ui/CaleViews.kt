package lins.compose.linswidget.ui

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import lins.compose.linswidget.ui.theme.LinsWidgetTheme

/**
 * @author: Linking.Lin
 * @Date: 2023/3/15 17:57
 * -----------------------------------------------------
 * - Tell me God, are you punishing me?                -
 * - Is this the price I'm paying for my past mistakes -
 * -----------------------------------------------------
 */


@Preview(showBackground = false, showSystemUi = false)
@Composable
fun LinsCal() {
//    Image(
//        painter = painterResource(R.drawable.blackhole),
//        modifier = Modifier.fillMaxSize(),
//        contentDescription = null,
//        alignment = Alignment.TopStart
//    )
//    Text(
//        text = "HHH"
//    )
    Text(
        text = "2023-03-15",
        modifier = Modifier
            .fillMaxWidth()
            .height(20.dp)
            .background(Color.Transparent)
    )
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