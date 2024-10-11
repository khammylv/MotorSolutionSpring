package com.example.MotorSolutionSpring.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long userId;

    @Column(unique = true, nullable = false)
    private int userIdentification;
   
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String birth;

    
    @Column(nullable = false)
    private String rol;


   
    public User() {
    }


    public User(Long userId, int userIdentification, String name, String email, String birth, String rol) {
        this.userIdentification = userIdentification;        
        this.name = name;
        this.email = email;
        this.birth = birth;
        this.rol = rol;
    }
    public Long getUserId(){
        return userId;
    }
    public void setUserId(Long userId) {
       this.userId = userId;
    }
    public int getUserIdentification() {
        return userIdentification;
    }

    public void setuserIdentification(int userIdentification) {
        this.userIdentification = userIdentification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

        public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
