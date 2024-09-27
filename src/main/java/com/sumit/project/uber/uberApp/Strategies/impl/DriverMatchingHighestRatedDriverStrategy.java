package com.sumit.project.uber.uberApp.Strategies.impl;

import com.sumit.project.uber.uberApp.Strategies.DriverMatchingStrategy;
import com.sumit.project.uber.uberApp.dto.RideRequestDto;
import com.sumit.project.uber.uberApp.entities.Driver;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy  implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return null;
    }
}
