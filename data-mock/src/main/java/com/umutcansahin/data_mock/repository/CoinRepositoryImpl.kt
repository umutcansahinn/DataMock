package com.umutcansahin.data_mock.repository

import com.umutcansahin.domain.model.Coin
import com.umutcansahin.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor() : CoinRepository {

    val coinList = arrayListOf(
        Coin("1", false, "Bitcoin", 12, "BTC"),
        Coin("2", true, "Dogecoin", 12, "DOGE")
    )

    override suspend fun getCoins(): List<Coin> = coinList
}