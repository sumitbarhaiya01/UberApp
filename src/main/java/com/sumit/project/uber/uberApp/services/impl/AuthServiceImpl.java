package com.sumit.project.uber.uberApp.services.impl;

import com.sumit.project.uber.uberApp.dto.DriverDto;
import com.sumit.project.uber.uberApp.dto.SignupDto;
import com.sumit.project.uber.uberApp.dto.UserDto;
import com.sumit.project.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return null;
    }

    @Override
    public UserDto signUp(SignupDto signupDTO) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
