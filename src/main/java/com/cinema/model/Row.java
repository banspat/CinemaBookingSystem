package com.cinema.model;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private final int rowNumber;
    private final List<Seat> seats;

    public Row(int rowNumber, int seatsInRow) {
        this.rowNumber = rowNumber;
        this.seats = new ArrayList<>();
        for (int i = 1; i <= seatsInRow; i++) {
            seats.add(new Seat(i));
        }
    }

    public List<Seat> getSeats() {
        return new ArrayList<>(seats);
    }
}
