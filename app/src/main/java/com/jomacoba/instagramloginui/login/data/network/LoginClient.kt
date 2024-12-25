package com.jomacoba.instagramloginui.login.data.network

import com.jomacoba.instagramloginui.login.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginClient {
    @GET(value = "v3/5fdc5abd-3104-434a-8894-1a7085584d95")
    suspend fun doLogin(): Response<LoginResponse>
}
