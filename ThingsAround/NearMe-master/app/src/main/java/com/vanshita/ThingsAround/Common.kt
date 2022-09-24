package com.gopal.ThingsAround

import com.gopal.ThingsAround.Model.Results
import com.gopal.ThingsAround.Remote.IGoogleAPIService
import com.gopal.ThingsAround.Remote.RetrofitClient


object Common {
    var currentResult: Results? = null

    private val GOOGLE_API_URL="https://maps.googleapis.com/"
    val googleApiService:IGoogleAPIService
    get()=RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService::class.java)
}