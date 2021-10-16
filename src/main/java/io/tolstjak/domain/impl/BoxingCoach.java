package io.tolstjak.domain.impl;

import io.tolstjak.domain.Coach;

public class BoxingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Boxing around 6 rounds";
    }
}
