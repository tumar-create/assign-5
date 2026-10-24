package com.example.smm;

import java.time.LocalDateTime;
public final class PostScheduler {
    private SchedulingStrategy strategy;

    public PostScheduler(SchedulingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SchedulingStrategy strategy) {
        this.strategy = strategy;
    }

    public LocalDateTime schedule(LocalDateTime now) {
        return strategy.schedule(now);
    }
}
