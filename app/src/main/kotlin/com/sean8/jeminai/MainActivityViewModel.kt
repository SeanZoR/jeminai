package com.sean8.jeminai

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sean8.jeminai.MainActivityUiState.Loading
import com.sean8.jeminai.MainActivityUiState.Success
import com.sean8.jeminai.core.data.repository.UserDataRepository
import com.sean8.jeminai.core.model.UserData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject() constructor(
    userDataRepository: UserDataRepository,
) : ViewModel() {
    val uiState: StateFlow<MainActivityUiState> = userDataRepository.userData.map {
        Success(it)
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = Loading,
    )
}

sealed interface MainActivityUiState {
    data object Loading : MainActivityUiState
    data class Success(
        val userData: UserData,
    ) : MainActivityUiState
}
