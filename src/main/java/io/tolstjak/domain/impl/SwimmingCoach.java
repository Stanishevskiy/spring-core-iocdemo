package io.tolstjak.domain.impl;

import io.tolstjak.domain.Coach;

public class SwimmingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Swim around 500m";
    }
}
