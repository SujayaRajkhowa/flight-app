package com.cts.seatavailabilityservice.controller;


import com.cts.flight.FlightDetails;
import com.cts.flight.SeatDetails;
import com.cts.seatavailabilityservice.service.SeatDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SeatDetailsController {

    @Autowired
    private SeatDetailsService seatDetailsService;


    @GetMapping("/seats/{seatId}")
    public Optional<SeatDetails> findById(@PathVariable("seatId") Integer seatId) {
        Optional<SeatDetails> seatDetails = seatDetailsService.findById(seatId);
        return seatDetails;
    }


    @GetMapping("/seats/flight/{flightId}")
    public Optional<FlightDetails> findByFlightId(@PathVariable("flightId") Integer flightId) {
        return seatDetailsService.findByFlightId(flightId);
    }

    @GetMapping("/seats")
    public  List<SeatDetails> findAll() {
        return seatDetailsService.findAll();
    }

}
