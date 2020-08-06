package com.cts.flightlistingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.cts.flight")
public class FlightListingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightListingServiceApplication.class, args);
	}

}
