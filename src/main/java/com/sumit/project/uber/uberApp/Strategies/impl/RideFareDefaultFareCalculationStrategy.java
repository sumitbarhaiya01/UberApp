package com.sumit.project.uber.uberApp.Strategies.impl;

import com.sumit.project.uber.uberApp.Strategies.RideFareCalculationStrategy;
import com.sumit.project.uber.uberApp.dto.RideRequestDto;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
