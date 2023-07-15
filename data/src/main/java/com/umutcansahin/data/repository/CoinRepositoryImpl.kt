package com.umutcansahin.data.repository

import com.umutcansahin.data.api.CoinPaprikaApi
import com.umutcansahin.data.extensions.toCoin
import com.umutcansahin.domain.model.Coin
import com.umutcansahin.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<Coin> {
        return api.getCoins().map { it.toCoin() }
    }
}