package com.example.smm;

import java.time.LocalDateTime;

public interface SchedulingStrategy {
    LocalDateTime schedule(LocalDateTime now);
}
