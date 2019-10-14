package com.thoughtworks.infinitegameoflife;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Cell {
    private int y;
    private int x;


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

    int getLiveNeighbour(List<Cell> liveNeighbours) {
        List<Cell> cells = allNeighbours();
        List<Cell> cellNeighbours = new ArrayList<>();
        for (Cell cell : liveNeighbours) {
            if (cells.contains(cell)) {
                cellNeighbours.add(cell);
            }
        }
        return cellNeighbours.size();
    }

    public List<Cell> getDeadNeighbours(List<Cell> deadNeighbours) {
        List<Cell> anotherCells = allNeighbours();
        List<Cell> cellNeighbours = new ArrayList<>();

        for (Cell cell : deadNeighbours) {
            if (!anotherCells.contains(cell)) {
                cellNeighbours.add(cell);
            }
        }
        return anotherCells;
    }

    public List<Cell> allNeighbours() {
        List<Cell> neighbours = new ArrayList<>();

        neighbours.add(new Cell(x-1,y));
        neighbours.add(new Cell(x + 1, y));
        neighbours.add(new Cell(x, y + 1));
        neighbours.add(new Cell(x, y - 1));
        neighbours.add(new Cell(x - 1, y + 1));
        neighbours.add(new Cell(x - 1, y - 1));
        neighbours.add( new Cell(x + 1, y + 1));
        neighbours.add(new Cell(x + 1, y - 1));

        return neighbours;

    }

}
