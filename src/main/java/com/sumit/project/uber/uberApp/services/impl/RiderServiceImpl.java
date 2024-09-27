package com.sumit.project.uber.uberApp.services.impl;

import com.sumit.project.uber.uberApp.dto.DriverDto;
import com.sumit.project.uber.uberApp.dto.RideDto;
import com.sumit.project.uber.uberApp.dto.RideRequestDto;
import com.sumit.project.uber.uberApp.dto.RiderDto;
import com.sumit.project.uber.uberApp.entities.RideRequest;
import com.sumit.project.uber.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper mapper;
    @Override
    public RideRequestDto rideRequest(RideRequestDto rideRequestDto) {
        RideRequest rideRequest = mapper.map(rideRequestDto , RideRequest.class);
        log.info(rideRequest.toString());
        return  null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRide() {
        return null;
    }
}
