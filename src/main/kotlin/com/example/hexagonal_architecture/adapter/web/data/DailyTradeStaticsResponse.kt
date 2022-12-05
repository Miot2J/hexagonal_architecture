package com.example.hexagonal_architecture.adapter.web.data

import com.example.hexagonal_architecture.domain.DailyTradeStatistics
import com.example.hexagonal_architecture.domain.TradeHistory

data class DailyTradeStaticsResponse(
    val tradeHistory: TradeHistory
) {
    constructor(dailyTradeStatics: DailyTradeStatistics) : this(tradeHistory = dailyTradeStatics.tradeHistory)
}
