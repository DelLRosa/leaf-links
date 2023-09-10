package com.greenhouse.leaflinks.controllers;

import com.greenhouse.leaflinks.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
}
