package com.umutcansahin.data.extensions

import com.umutcansahin.data.model.CoinModel
import com.umutcansahin.domain.model.Coin

fun CoinModel.toCoin(): Coin {
    return Coin(
        id, isActive, name, rank, symbol
    )
}