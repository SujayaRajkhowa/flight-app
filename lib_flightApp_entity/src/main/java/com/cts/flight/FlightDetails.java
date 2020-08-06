package com.cts.flight;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name="FlightDetails")
public class FlightDetails {

	@Id
	@GeneratedValue
	private Integer flightId;
	@NotNull
	private String flightName;
	@NotNull
	private String origin;
	@NotNull
	private String destination;
	@Max(value=5, message = "Number of seats must be less than or equal to 5")
	private Integer numberOfSeats;

	@OneToMany(mappedBy = "flightDetails")
	private List<SeatDetails> seatDetails;

}

