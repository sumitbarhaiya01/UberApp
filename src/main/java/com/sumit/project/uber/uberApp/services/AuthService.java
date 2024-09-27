package com.sumit.project.uber.uberApp.services;

import com.sumit.project.uber.uberApp.dto.DriverDto;
import com.sumit.project.uber.uberApp.dto.SignupDto;
import com.sumit.project.uber.uberApp.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signUp(SignupDto signupDTO);

    DriverDto onboardNewDriver(Long userId);

}
