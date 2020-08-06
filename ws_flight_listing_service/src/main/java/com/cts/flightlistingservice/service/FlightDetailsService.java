package com.cts.flightlistingservice.service;

import java.util.List;
import java.util.Optional;

import com.cts.flightlistingservice.exception.FlightNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.flight.FlightDetails;
import com.cts.flightlistingservice.repository.FlightDetailsRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FlightDetailsService {

	@Autowired
	private FlightDetailsRepo flightDetailsRepo;

	//Service1
	public Optional<FlightDetails> findById(Integer flightId) {

		Optional<FlightDetails> flightDetails = flightDetailsRepo.findById(flightId);
		if(!flightDetails.isPresent())throw new FlightNotFoundException("flightId- "+flightId);
		return flightDetails;

	}

	//Service2
	public FlightDetails addFlight(FlightDetails flightDetails) {

		return flightDetailsRepo.save(flightDetails);
	}

	//ExtraService
	public List<FlightDetails> findAll() {
		return flightDetailsRepo.findAll();

	}

}
