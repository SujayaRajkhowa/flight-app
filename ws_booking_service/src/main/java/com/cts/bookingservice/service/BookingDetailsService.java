package com.cts.bookingservice.service;

import com.cts.bookingservice.repository.SeatDetailsRepo;
import com.cts.bookingservice.repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class BookingDetailsService {

    @Autowired
    private SeatDetailsRepo seatDetailsRepo;

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    //Service1
    public void blockSeat(Integer userId, Integer seatId) {
        //book a seatId for a given userId and update in seatDetails table

    }

    //Service2
    public void unblockSeat(Integer userId) {
        //If there is any userId against any seatId in the SeatDetails Table then remove that
        //userId and make the seat status as available.
    }
}
