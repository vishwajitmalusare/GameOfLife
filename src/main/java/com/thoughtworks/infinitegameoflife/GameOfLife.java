package com.thoughtworks.infinitegameoflife;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {

    private final List<Cell> aliveCells;

    public GameOfLife(List<Cell> aliveCells) {
        this.aliveCells = aliveCells;
    }

    public List<Cell> getAliveCells() {

        List<Cell> newAliveCells = new ArrayList<>();

        for (int i = 0; i < aliveCells.size(); i++) {
            if ((getLiveNeighbour(i) == 2) || (getLiveNeighbour(i)) == 3) {
                newAliveCells.add(aliveCells.get(i));
            }

            List<Cell> deadNeighbours = aliveCells.get(i).getDeadNeighbours(aliveCells);

            if ((deadNeighbours.get(i).getLiveNeighbour(aliveCells)) == 3) {
                newAliveCells.add(deadNeighbours.get(i));
            }
        }
        return newAliveCells;
    }

    private int getLiveNeighbour(int i) {
        return aliveCells.get(i).getLiveNeighbour(aliveCells);
    }

}
