package com.thoughtworks.infinitegameoflife;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {

    private final List<Cell> aliveCells;

    public GameOfLife(List<Cell> aliveCells) {
        this.aliveCells = aliveCells;
    }

    public List<Cell> getAliveCells() {
        if(aliveCells.size()>2) {
            List<Cell> isAlive = new ArrayList<>();

            Cell cellOne = aliveCells.get(0);
            Cell cellTwo = aliveCells.get(1);
            //Cell cellThree = aliveCells.get(2);

            List<Cell> allNeighbours = cellOne.allNeighbours();
            System.out.println(allNeighbours);

//        if (cellTwo.isNeighbour(cellOne) && cellTwo.isNeighbour(cellThree)) {
//            isAlive.add(cellTwo);
            if (allNeighbours.contains(cellTwo)) {
                isAlive.add(cellOne);
                return isAlive;
            }
        }
            return new ArrayList<>();
    }
}