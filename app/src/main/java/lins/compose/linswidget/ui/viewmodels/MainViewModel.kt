package lins.compose.linswidget.ui.viewmodels

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import lins.compose.linswidget.logic.model.data.CaleData
import lins.compose.linswidget.logic.model.data.Lunar
import lins.compose.linswidget.logic.model.repo.DataRepositoryImp
import javax.inject.Inject

/**
 * @author: Linking.Lin
 * @Date: 2023/3/15 20:31
 * -----------------------------------------------------
 * - Tell me God, are you punishing me?                -
 * - Is this the price I'm paying for my past mistakes -
 * -----------------------------------------------------
 */

@HiltViewModel
class MainViewModel @Inject constructor(
) : ViewModel() {
    @Inject
    lateinit var repository: DataRepositoryImp

    private var _caleDate: MutableStateFlow<Lunar?> = MutableStateFlow(null)
    val caleData get() = _caleDate

    init {
        queryCalenDate()
    }


    fun queryCalenDate() {
        viewModelScope.launch {
            _caleDate.value = repository.getData()
        }

    }
}