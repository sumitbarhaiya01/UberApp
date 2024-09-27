package com.sumit.project.uber.uberApp.services;

import com.sumit.project.uber.uberApp.dto.DriverDto;
import com.sumit.project.uber.uberApp.dto.RideDto;
import com.sumit.project.uber.uberApp.dto.RideRequestDto;
import com.sumit.project.uber.uberApp.dto.RiderDto;
import com.sumit.project.uber.uberApp.entities.RideRequest;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RiderService {

    RideRequestDto rideRequest(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRide();
}
