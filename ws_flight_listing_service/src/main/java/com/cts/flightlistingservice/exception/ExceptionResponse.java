package com.cts.flightlistingservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
@AllArgsConstructor
@Getter
public class ExceptionResponse {
private Date timeStamp;
private String message;
private String details;


}
