package com.jomacoba.instagramloginui.login.data.network.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(@SerializedName(value = "success") val success: Boolean)
