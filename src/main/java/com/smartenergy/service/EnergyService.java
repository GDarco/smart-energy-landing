package com.smartenergy.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;

@Service
public class EnergyService {

    // Оптимізація: додано кешування для уникнення повторних розрахунків
    @Cacheable(value = "energyReports", key = "#deviceId")
    public Double getOptimizedReport(String deviceId) {
        // Симуляція важкого розрахунку, який тепер оптимізовано
        return 42.0; 
    }

    // Оптимізація: асинхронна обробка для розвантаження CPU
    @Async
    public CompletableFuture<String> processHeavyData() {
        return CompletableFuture.completedFuture("Data processed successfully");
    }
}
