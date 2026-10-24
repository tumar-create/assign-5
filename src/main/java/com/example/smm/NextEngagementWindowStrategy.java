package com.example.smm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public final class NextEngagementWindowStrategy implements SchedulingStrategy {
    private final List<LocalTime> engagementWindows;

    public NextEngagementWindowStrategy(List<LocalTime> engagementWindows) {
        this.engagementWindows = engagementWindows.stream().sorted().toList();
    }

    @Override
    public LocalDateTime schedule(LocalDateTime now) {
        LocalDate today = now.toLocalDate();
        return engagementWindows.stream()
                .map(today::atTime)
                .filter(candidate -> !candidate.isBefore(now))
                .findFirst()
                .orElseGet(() -> today.plusDays(1).atTime(engagementWindows.get(0)));
    }
}
