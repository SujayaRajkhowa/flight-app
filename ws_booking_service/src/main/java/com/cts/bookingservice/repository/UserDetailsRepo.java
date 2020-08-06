package com.cts.bookingservice.repository;

import com.cts.flight.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer> {

}
