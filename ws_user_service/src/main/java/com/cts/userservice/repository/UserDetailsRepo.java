package com.cts.userservice.repository;

import com.cts.flight.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer> {

    public UserDetails findByEmailId(String emailId);
    public UserDetails findByUserId(Integer userId);

}
