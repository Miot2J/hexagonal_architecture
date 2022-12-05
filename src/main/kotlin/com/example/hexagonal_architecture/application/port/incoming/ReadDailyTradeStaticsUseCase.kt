package com.example.hexagonal_architecture.application.port.incoming

import com.example.hexagonal_architecture.domain.DailyTradeStatistics
import java.time.LocalDate

interface ReadDailyTradeStaticsUseCase {
    fun getDailyTradeStatics(userId: Long, requestDate: LocalDate): DailyTradeStatistics
}