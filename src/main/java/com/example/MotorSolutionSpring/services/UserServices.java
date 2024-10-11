package com.example.MotorSolutionSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MotorSolutionSpring.entities.User;
import com.example.MotorSolutionSpring.repository.UserRepository;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;

    public List<User> getUser() {
        return (List<User>) userRepository.findAll();
    }
    
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    
    public User saveOrUdpdateUser(User user) {
        return userRepository.save(user);
    }
    
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
