package com.thoughtworks.infinitegameoflifetest;


import com.thoughtworks.infinitegameoflife.Cell;
import com.thoughtworks.infinitegameoflife.GameOfLife;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameOfLifeTest {

    @Test
    void givenOneAliveCellWhenCheckWillAliveThenShouldBeDead() {
        List<Cell> aliveCells = new ArrayList<>();
        Cell cellOne = new Cell(2, 2);

        aliveCells.add(cellOne);

        GameOfLife game = new GameOfLife(aliveCells);
        List<Cell> newList = new ArrayList<>();
        assertEquals(newList, game.getAliveCells());
    }

    @Test
    void givenTwoAliveCellsWhenCheckWillAliveThenShouldDead() {
        List<Cell> aliveCells = new ArrayList<>();
        Cell cellOne = new Cell(1, 2);
        Cell cellTwo = new Cell(2, 2);
        //Cell celllThree = new Cell(0, 2);

        aliveCells.add(cellOne);
        aliveCells.add(cellTwo);
        //aliveCells.add(celllThree);

        GameOfLife game = new GameOfLife(aliveCells);

        List<Cell> newList = new ArrayList<>();
        assertEquals(newList, game.getAliveCells());
    }

}
