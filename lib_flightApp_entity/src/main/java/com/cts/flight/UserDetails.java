package com.cts.flight;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Data
@Entity
@Table(name="UserDetails")
public class UserDetails {

	@Id
	@GeneratedValue
	private Integer userId;
	@NotNull
	private String userName;
	@NotNull
	@Size(max = 10, message = "Phone number must not exceed 10 digits")
	private String phone;
	@Column(unique=true)
	@NotNull
	private String emailId;
	private Date effDate;
	private Date expiryDate;

	@OneToOne(mappedBy = "userDetails")
	private SeatDetails seatDetails;
}