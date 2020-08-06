package com.cts.userservice.controller;

import com.cts.flight.UserDetails;
import com.cts.userservice.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserDetailsController {
    @Autowired
    private UserDetailsService userDetailsService;

    @GetMapping("/users")
    public List<UserDetails> findAll() {

        return userDetailsService.findAll();
    }
    @GetMapping("/users/{emailId}")
    public UserDetails findById(@PathVariable("emailId") String emailId) {

        return userDetailsService.findByEmailId(emailId);
    }

    @PostMapping("/users")
    public ResponseEntity<UserDetails> addUserDetails(@Valid @RequestBody UserDetails userDetails) {
        UserDetails savedUser =  userDetailsService.addUser(userDetails);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{userId}").buildAndExpand(savedUser.getUserId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/users/{userId}")
    public UserDetails inactivateById(@PathVariable("userId") Integer userId)
    {
        return userDetailsService.inactivateUser(userId);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteById(@PathVariable("userId") Integer userId) {
        userDetailsService.deleteUserId(userId);
    }
}
