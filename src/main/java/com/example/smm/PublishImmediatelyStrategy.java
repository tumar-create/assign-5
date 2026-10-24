package com.example.smm;

import java.time.LocalDateTime;
public final class PublishImmediatelyStrategy implements SchedulingStrategy {
    @Override
    public LocalDateTime schedule(LocalDateTime now) {
        return now;
    }
}
