package com.cinema.model;

import com.cinema.system.SeatObserver;
import java.util.ArrayList;
import java.util.List;

public class Seat {
    private final int seatNumber;
    private boolean isReserved;
    private final List<SeatObserver> observers = new ArrayList<>();

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean reserve() {
        if (!isReserved) {
            isReserved = true;
            notifyObservers();
            return true;
        }
        return false;
    }

    public void addObserver(SeatObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
