package com.cts.seatavailabilityservice.repository;

import com.cts.flight.FlightDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightDetailsRepo extends JpaRepository<FlightDetails, Integer> {

}
