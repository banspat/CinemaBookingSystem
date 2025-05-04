package com.cinema.model;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private final String name;
    private final List<Row> rows;

    public Theater(String name, int rowCount, int seatsPerRow) {
        this.name = name;
        this.rows = new ArrayList<>();
        for (int i = 1; i <= rowCount; i++) {
            rows.add(new Row(i, seatsPerRow));
        }
    }

    public List<Row> getRows() {
        return new ArrayList<>(rows);
    }
}
