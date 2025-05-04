package com.cinema;

import com.cinema.model.*;
import com.cinema.system.CinemaBookingSystem;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize system
        CinemaBookingSystem system = CinemaBookingSystem.getInstance();

        // 2. Create theater with 2 rows, 5 seats each (for demo)
        Theater theater = new Theater("Screen 1", 2, 5);

        // 3. Create movie and show
        Movie movie = new Movie("The Matrix", 136);
        Show show = new Show(movie, LocalDateTime.now().plusHours(2), theater);

        // 4. Create customer
        Customer customer = new Customer("John Doe", "555-1234");

        // 5. Book seats (first 2 seats in first row)
        List<Seat> seats = theater.getRows().get(0).getSeats().subList(0, 2);
        seats.forEach(seat -> seat.addObserver(customer));
        seats.forEach(Seat::reserve);

        // 6. Create booking
        Booking booking = system.createBooking(customer, show, seats);
        System.out.println(booking);
    }
}