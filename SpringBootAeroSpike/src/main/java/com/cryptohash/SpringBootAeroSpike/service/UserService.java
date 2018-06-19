package com.cryptohash.SpringBootAeroSpike.service;

import com.cryptohash.SpringBootAeroSpike.model.User;
import com.cryptohash.SpringBootAeroSpike.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    @Autowired
    UserRepository userRepository;


    public List<User> getAll() {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public void create(User user) {
        userRepository.save(user);
    }
}
