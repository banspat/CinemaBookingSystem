package com.cinema.system;

import com.cinema.model.Seat;

public interface SeatObserver {
    /**
     * Called when a seat's reservation status changes
     * @param seat The seat that was reserved/released
     */
    void update(Seat seat);
}