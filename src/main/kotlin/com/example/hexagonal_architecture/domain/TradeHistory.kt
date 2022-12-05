package com.example.hexagonal_architecture.domain

import com.example.hexagonal_architecture.domain.enums.Coin
import com.example.hexagonal_architecture.domain.enums.TradeType
import java.math.BigDecimal
import java.time.LocalDateTime

class TradeHistory(
    val txid: String,
    var tradeType: TradeType,
    var coin: Coin,
    var amount: BigDecimal,
    var orderedAt: LocalDateTime,
    var tradedAt: LocalDateTime
)