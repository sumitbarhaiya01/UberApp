package com.sumit.project.uber.uberApp.Strategies;

import com.sumit.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);

}
