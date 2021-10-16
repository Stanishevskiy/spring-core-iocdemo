package io.tolstjak.domain.impl;

import io.tolstjak.domain.Coach;

public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Play tennis around 90 minutes";
    }
}
