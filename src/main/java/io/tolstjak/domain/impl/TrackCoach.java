package io.tolstjak.domain.impl;

import io.tolstjak.domain.Coach;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run around 20 km";
    }
}
