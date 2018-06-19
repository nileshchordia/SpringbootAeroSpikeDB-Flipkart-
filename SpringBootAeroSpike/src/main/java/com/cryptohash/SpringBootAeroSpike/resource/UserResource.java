package com.cryptohash.SpringBootAeroSpike.resource;

import com.cryptohash.SpringBootAeroSpike.model.User;
import com.cryptohash.SpringBootAeroSpike.repository.UserRepository;
import com.cryptohash.SpringBootAeroSpike.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    @Autowired
   UserService userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAll();
    }

    @PostMapping
    public List<User> create(@RequestBody final User user){
        userService.create(user);
        return userService.getAll();
    }



}
