package com.cinema.model;

import java.util.List;

public class Booking {
    private final Customer customer;
    private final Show show;
    private final List<Seat> seats;

    public Booking(Customer customer, Show show, List<Seat> seats) {
        this.customer = customer;
        this.show = show;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return String.format("Booking for %s at %s - Seats: %s",
                customer.getName(),
                show.getShowTime(),
                seats.stream().mapToInt(Seat::getSeatNumber).toArray());
    }
}
