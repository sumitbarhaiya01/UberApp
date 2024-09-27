package com.sumit.project.uber.uberApp.services.impl;

import com.sumit.project.uber.uberApp.dto.DriverDto;
import com.sumit.project.uber.uberApp.dto.RideDto;
import com.sumit.project.uber.uberApp.dto.RiderDto;
import com.sumit.project.uber.uberApp.services.DriverService;
import org.springframework.stereotype.Service;

import java.sql.Driver;
import java.util.List;
@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRide() {
        return null;
    }
}
