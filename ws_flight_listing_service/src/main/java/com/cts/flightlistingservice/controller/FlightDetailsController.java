package com.cts.flightlistingservice.controller;


import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.flight.FlightDetails;
import com.cts.flightlistingservice.service.FlightDetailsService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;

@RestController
public class FlightDetailsController {

    @Autowired
    private FlightDetailsService flightDetailsService;

    @GetMapping("/flights/{flightId}")
    public Optional<FlightDetails> findById(@PathVariable("flightId") Integer flightId) {
        Optional<FlightDetails> flightDetails = flightDetailsService.findById(flightId);
        return flightDetails;
    }

    @PostMapping("/flights")
    public ResponseEntity<FlightDetails> addFlightDetails(@Valid @RequestBody FlightDetails flightDetails) {
        FlightDetails savedFlight = flightDetailsService.addFlight(flightDetails);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{flightId}").buildAndExpand(savedFlight.getFlightId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/flights")
    public List<FlightDetails> findAll() {

        return flightDetailsService.findAll();
    }
}
