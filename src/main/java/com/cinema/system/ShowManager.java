package com.cinema.system;

import com.cinema.model.Show;
import java.util.ArrayList;
import java.util.List;

public class ShowManager {
    private final List<Show> shows = new ArrayList<>();

    public void addShow(Show show) {
        shows.add(show);
    }

    public List<Show> getShows() {
        return new ArrayList<>(shows);
    }
}
