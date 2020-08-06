package com.cts.seatavailabilityservice.service;

import com.cts.flight.FlightDetails;
import com.cts.flight.SeatDetails;
import com.cts.seatavailabilityservice.exception.SeatNotFoundException;
import com.cts.seatavailabilityservice.repository.FlightDetailsRepo;
import com.cts.seatavailabilityservice.repository.SeatDetailsRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SeatDetailsService {

    @Autowired
    private SeatDetailsRepo seatDetailsRepo;

    @Autowired
    private FlightDetailsRepo flightDetailsRepo;

    //Service1
    public Optional<SeatDetails> findById(Integer seatId) {

        Optional<SeatDetails> seatDetails = seatDetailsRepo.findById(seatId);
        if(!seatDetails.isPresent())throw new SeatNotFoundException("seatId- "+seatId);
        return seatDetails;

    }

    //Service2
    public Optional<FlightDetails> findByFlightId(Integer flightId) {
        Optional<FlightDetails> flightDetails =  flightDetailsRepo.findById(flightId);
        return flightDetails;

    }

    //ExtraService
    public  List<SeatDetails> findAll() {
        return seatDetailsRepo.findAll();
    }
}
