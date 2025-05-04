package com.cinema.system;

import com.cinema.model.*;
import java.util.ArrayList;
import java.util.List;

public class CinemaBookingSystem {
    private static CinemaBookingSystem instance;
    private final List<Booking> bookings = new ArrayList<>();

    private CinemaBookingSystem() {}

    public static CinemaBookingSystem getInstance() {
        if (instance == null) {
            instance = new CinemaBookingSystem();
        }
        return instance;
    }

    public Booking createBooking(Customer customer, Show show, List<Seat> seats) {
        Booking booking = new Booking(customer, show, seats);
        bookings.add(booking);
        return booking;
    }
}