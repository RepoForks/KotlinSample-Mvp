package me.immathan.kotlinlogin.data

import me.immathan.kotlinlogin.data.network.ApiHelper
import retrofit2.Call

/**
 * Created by Mathan-GG on 06-Sep-17.
 */
class AppDataManager (val apiHelper: ApiHelper): DataManager {

    override fun doLogin(mobileNo: String, password: String): Call<LoginResponse> {
        return apiHelper.doLogin(mobileNo, password)
    }

}