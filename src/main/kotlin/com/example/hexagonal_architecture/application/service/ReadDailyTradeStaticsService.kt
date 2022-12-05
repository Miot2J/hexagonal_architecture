package com.example.hexagonal_architecture.application.service

import com.example.hexagonal_architecture.application.port.incoming.ReadDailyTradeStaticsUseCase
import com.example.hexagonal_architecture.domain.DailyTradeStatistics
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class ReadDailyTradeStaticsService() : ReadDailyTradeStaticsUseCase {
    override fun getDailyTradeStatics(userId: Long, requestDate: LocalDate): DailyTradeStatistics {
        TODO("Not yet implemented")
    }
}