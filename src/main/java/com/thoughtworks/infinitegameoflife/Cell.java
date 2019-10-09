package com.thoughtworks.infinitegameoflife;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cell {
    private int y;
    private int x;

//    public Cell(Cell cell) {
//    }


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

    boolean isNeighbour(Cell cell) {
        List<Cell> cells = allNeighbours();
        return cells.contains(cell);
    }


    private List<Cell> allNeighbours() {
        List<Cell> neighbours = new ArrayList<>();
        //LeftNeighbour
        int newLeftNeighbourX = x - 1;
        Cell leftNeighbour = new Cell(newLeftNeighbourX, y);

        //rightNeighbour
        int newRightNeighbourX = x + 1;
        Cell rightNeighbour = new Cell(newRightNeighbourX, y);

        int newUpNeighbourY = y + 1;
        Cell upNeighbour = new Cell(x, newUpNeighbourY);

        int newDownNeighbourY = y - 1;
        Cell downNeighbour = new Cell(x, newDownNeighbourY);

        int newUpperLeftNeighbourX = x - 1;
        int newUpperLeftNeighbourY = y + 1;
        Cell upperLeft = new Cell(newUpperLeftNeighbourX, newUpperLeftNeighbourY);

        int newLowerLeftNeighbourX = x - 1;
        int newLowerLeftNeighbourY = y - 1;
        Cell lowerLeft = new Cell(newLowerLeftNeighbourX, newLowerLeftNeighbourY);

        int newUpperRightNeighbourX = x + 1;
        int newUpperRightNeighbourY = y + 1;
        Cell upperRight = new Cell(newUpperRightNeighbourX, newUpperRightNeighbourY);

        int newLowerRightNeighbourX = x + 1;
        int newLowerRightNeighbourY = y - 1;
        Cell lowerRight = new Cell(newLowerRightNeighbourX, newLowerRightNeighbourY);


        neighbours.add(leftNeighbour);
        neighbours.add(rightNeighbour);
        neighbours.add(upNeighbour);
        neighbours.add(downNeighbour);
        neighbours.add(upperLeft);
        neighbours.add(lowerLeft);
        neighbours.add(upperRight);
        neighbours.add(lowerRight);

        return neighbours;

    }

}
