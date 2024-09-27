package com.sumit.project.uber.uberApp.services.impl;

import com.sumit.project.uber.uberApp.dto.DriverDto;
import com.sumit.project.uber.uberApp.dto.RideDto;
import com.sumit.project.uber.uberApp.dto.RideRequestDto;
import com.sumit.project.uber.uberApp.dto.RiderDto;
import com.sumit.project.uber.uberApp.entities.Driver;
import com.sumit.project.uber.uberApp.entities.Ride;
import com.sumit.project.uber.uberApp.entities.enums.RideStatus;
import com.sumit.project.uber.uberApp.services.RideService;
import com.sumit.project.uber.uberApp.services.RiderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RideServiceImpl implements RideService {

    @Override
    public Ride getRIdeById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRideOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRideOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
