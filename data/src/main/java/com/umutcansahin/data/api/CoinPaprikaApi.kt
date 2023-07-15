package com.umutcansahin.data.api

import com.umutcansahin.data.model.CoinModel
import retrofit2.http.GET

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinModel>
}