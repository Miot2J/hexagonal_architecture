package com.example.hexagonal_architecture.adapter.jpa.tradeHistory

import com.example.hexagonal_architecture.domain.TradeHistory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TradeHistoryRepository : JpaRepository<TradeHistory, Long>