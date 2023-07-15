package com.umutcansahin.domain.repository

import com.umutcansahin.domain.model.Coin

interface CoinRepository {
    suspend fun getCoins(): List<Coin>
}