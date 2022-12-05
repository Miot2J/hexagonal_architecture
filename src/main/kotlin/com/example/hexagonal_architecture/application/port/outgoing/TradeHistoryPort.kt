package com.example.hexagonal_architecture.application.port.outgoing

import com.example.hexagonal_architecture.domain.TradeHistory

interface TradeHistoryPort {
    fun getTradeHistory() : TradeHistory
}