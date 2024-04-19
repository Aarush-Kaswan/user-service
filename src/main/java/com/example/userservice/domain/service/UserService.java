package com.example.userservice.domain.service;

import com.example.userservice.domain.model.User;
import com.example.userservice.domain.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepo;

    public void addUser(User user) {
        userRepo.addUser(user);
    }
}
