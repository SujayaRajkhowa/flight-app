package com.cts.userservice.service;

import com.cts.flight.UserDetails;
import com.cts.userservice.repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class UserDetailsService {

    @Autowired
     private UserDetailsRepo userDetailsRepo;

    //Service1
    public UserDetails findByEmailId(String emailId) {
        return userDetailsRepo.findByEmailId(emailId);
    }

    //Service2
    public UserDetails addUser(UserDetails userDetails) {
        return userDetailsRepo.save(userDetails);
    }

    //Service3
    public UserDetails inactivateUser(Integer userId) {
        UserDetails userDetails = userDetailsRepo.findByUserId(userId);
        long millis=System.currentTimeMillis();
        Date date=new Date(millis);
        userDetails.setExpiryDate(date);
        UserDetails updatedUser = userDetailsRepo.save(userDetails);
        return updatedUser;
    }


    //ExtraService
    public void deleteUserId(Integer userId) {
        userDetailsRepo.deleteById(userId);
    }

    //ExtraService
    public List<UserDetails> findAll() {
        return userDetailsRepo.findAll();
    }

    }
