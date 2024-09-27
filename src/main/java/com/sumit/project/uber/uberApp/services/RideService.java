package com.sumit.project.uber.uberApp.services;

import com.fasterxml.jackson.core.json.PackageVersion;
import com.sumit.project.uber.uberApp.dto.DriverDto;
import com.sumit.project.uber.uberApp.dto.RideRequestDto;
import com.sumit.project.uber.uberApp.entities.Driver;
import com.sumit.project.uber.uberApp.entities.Ride;
import com.sumit.project.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRIdeById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto , Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRideOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRideOfDriver(Long driverId, PageRequest pageRequest);

}
