package com.example.hexagonal_architecture.domain

import java.time.LocalDate

class DailyTradeStatistics(
    var date: LocalDate,
    var user: User,
    var tradeHistory: TradeHistory,
)