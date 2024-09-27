package com.sumit.project.uber.uberApp.Strategies;

import com.sumit.project.uber.uberApp.dto.RideRequestDto;
import com.sumit.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
