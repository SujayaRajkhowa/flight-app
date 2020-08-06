package com.cts.bookingservice.repository;

import com.cts.flight.SeatDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatDetailsRepo extends JpaRepository<SeatDetails, Integer> {

}
