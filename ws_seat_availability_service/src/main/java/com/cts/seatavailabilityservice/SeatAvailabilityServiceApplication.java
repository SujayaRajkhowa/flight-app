package com.cts.seatavailabilityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.cts.flight")
@SpringBootApplication
public class SeatAvailabilityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeatAvailabilityServiceApplication.class, args);
	}

}
