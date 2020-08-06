package com.cts.seatavailabilityservice.repository;

import com.cts.flight.SeatDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SeatDetailsRepo extends JpaRepository<SeatDetails, Integer> {

    public Optional<SeatDetails> findById(Integer flightId);
}
