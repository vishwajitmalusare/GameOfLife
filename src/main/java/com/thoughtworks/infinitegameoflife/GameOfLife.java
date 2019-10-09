package com.thoughtworks.infinitegameoflife;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {

    private final List<Cell> aliveCells;

    public GameOfLife(List<Cell> aliveCells) {
        this.aliveCells = aliveCells;
    }

    public List<Cell> getAliveCells() {
        ArrayList<Cell> isAlive = new ArrayList<>();
        if (aliveCells.size() > 2) {

           for (int i=0;i<aliveCells.size();i++){
               for (int j=0;j<aliveCells.size();j++) {

                   if (!aliveCells.get(i).equals(aliveCells.get(j)) && aliveCells.get(i).isNeighbour(aliveCells.get(j))) {
                       if(!isAlive.contains(aliveCells.get(i))) {
                           isAlive.add(aliveCells.get(i));
                       }
                   }
               }
           }

        }
        return isAlive;
    }
}
/*
* if (aliveCells.size() > 2) {
            ArrayList<Cell> isAlive = new ArrayList<>();

            Cell cellOne = aliveCells.get(0);
            Cell cellTwo = aliveCells.get(1);
            Cell cellThree = aliveCells.get(2);

            if (cellOne.isNeighbour(cellTwo) && cellOne.isNeighbour(cellThree)) {
                isAlive.add(cellOne);
                return isAlive;
            }
        }
* */