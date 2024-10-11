package com.example.MotorSolutionSpring.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MotorSolutionSpring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
