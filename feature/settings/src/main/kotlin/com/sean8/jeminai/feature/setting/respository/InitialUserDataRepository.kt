//package com.sean8.jeminai.feature.setting.respository
//
//import android.content.Context
//import androidx.datastore.core.DataStore
//import com.sean8.jeminai.feature.settings.model.data.DarkThemeConfig
//import com.sean8.jeminai.feature.settings.model.data.UserData
//import kotlinx.coroutines.flow.Flow
//import javax.inject.Inject
//
//internal class InitialUserDataRepository @Inject constructor(
//    private val appPreferenceDataSource: AppPreferenceDataSource,
//) : UserDataRepository {
//    override val userData: Flow<UserData>
//        get() = TODO("Not yet implemented")
//
//    override suspend fun setDarkThemeConfig(darkThemeConfig: DarkThemeConfig) {
//        TODO("Not yet implemented")
//    }
//}