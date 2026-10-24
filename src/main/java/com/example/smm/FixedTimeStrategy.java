package com.example.smm;

import java.time.LocalDateTime;
public final class FixedTimeStrategy implements SchedulingStrategy {
    private final LocalDateTime publicationTime;

    public FixedTimeStrategy(LocalDateTime publicationTime) {
        this.publicationTime = publicationTime;
    }

    @Override
    public LocalDateTime schedule(LocalDateTime now) {
        return publicationTime;
    }
}
