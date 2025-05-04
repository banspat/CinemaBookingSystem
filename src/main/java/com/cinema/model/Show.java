package com.cinema.model;

import java.time.LocalDateTime;

public class Show {
    private final Movie movie;
    private final LocalDateTime showTime;
    private final Theater theater;

    public Show(Movie movie, LocalDateTime showTime, Theater theater) {
        this.movie = movie;
        this.showTime = showTime;
        this.theater = theater;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public Movie getMovie() {
        return movie;
    }
}
