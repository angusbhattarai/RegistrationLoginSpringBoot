package com.springboot.security.service;

import com.springboot.security.model.User;
import com.springboot.security.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
