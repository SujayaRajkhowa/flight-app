package com.cts.flightlistingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.flight.FlightDetails;

@Repository
public interface FlightDetailsRepo extends JpaRepository<FlightDetails, Integer> {

}
