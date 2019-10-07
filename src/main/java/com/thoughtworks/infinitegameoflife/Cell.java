package com.thoughtworks.infinitegameoflife;

import java.util.Objects;

public class Cell {
    private final int y;
    private final int x;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cell cell = (Cell) obj;
        return y == cell.y &&
                x == cell.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y, x);
    }

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
