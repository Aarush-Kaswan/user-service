package com.example.userservice.controller;

import com.example.userservice.domain.model.User;
import com.example.userservice.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/userdb")
public class UserController {
    private final UserService userService;

    @PostMapping("/addUser")
    public Boolean addUser(@RequestBody User user) {
        userService.addUser(user);
        return true;
    }
}
