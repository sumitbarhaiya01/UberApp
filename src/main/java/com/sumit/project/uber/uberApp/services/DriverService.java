package com.sumit.project.uber.uberApp.services;

import com.sumit.project.uber.uberApp.dto.DriverDto;
import com.sumit.project.uber.uberApp.dto.RideDto;
import com.sumit.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRide();
}
