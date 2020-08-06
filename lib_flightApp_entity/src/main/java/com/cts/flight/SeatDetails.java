package com.cts.flight;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="SeatDetails")
public class SeatDetails {

	@Id
	@GeneratedValue
	private Integer seatId;
	private String seatStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private FlightDetails flightDetails;

	@OneToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private UserDetails userDetails;
}

