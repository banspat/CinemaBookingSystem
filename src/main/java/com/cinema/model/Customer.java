package com.cinema.model;

import com.cinema.system.SeatObserver;

public class Customer implements SeatObserver {
    private final String name;
    private final String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public void update(Seat seat) {
        System.out.printf("[%s] Notification: Seat %d reserved! Contact: %s%n",
                name, seat.getSeatNumber(), phone);
    }

    public String getName() {
        return name;
    }
}
