package com.example.MotorSolutionSpring.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MotorSolutionSpring.entities.User;
import com.example.MotorSolutionSpring.services.UserServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "api/v1/motorSolution")
public class UserController {
    @Autowired
    UserServices userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUser();
    }

    @PostMapping()
    public User postUsers(@RequestBody User user) {
        return userService.saveOrUdpdateUser(user);
    }

    @PutMapping()
    public User putUsers(@RequestBody User usuario) {
        return userService.saveOrUdpdateUser(usuario);
    }

    @GetMapping(path = "/{userId}")
    public User getUserById(@PathVariable("userId") Long userId) {
        return userService.getUserById(userId);
    }

    @DeleteMapping(path = "/{userId}")
    public void deleteUser(@PathVariable("userId") Long id) {
        userService.deleteUser(id);
    }

}
