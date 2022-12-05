package com.example.hexagonal_architecture.adapter.web

import com.example.hexagonal_architecture.adapter.web.data.DailyTradeStaticsResponse
import com.example.hexagonal_architecture.application.port.incoming.ReadDailyTradeStaticsUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
class DailyTradeStaticsController(
    private val readTradeStaticsUseCase: ReadDailyTradeStaticsUseCase,
) {
    @GetMapping("dailyTradeStatics/{userId}")
    fun getDailyTradeStatics(
        @PathVariable userId: Long,
        @RequestParam requestDate: LocalDate
    ): DailyTradeStaticsResponse {
        return DailyTradeStaticsResponse(readTradeStaticsUseCase.getDailyTradeStatics(userId, requestDate))
    }
}