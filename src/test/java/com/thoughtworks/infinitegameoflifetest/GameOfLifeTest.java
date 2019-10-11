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
        List<Cell> aliveCellsAtTimeZero = new ArrayList<>();
        Cell cellOne = new Cell(2, 2);

        aliveCellsAtTimeZero.add(cellOne);

        GameOfLife game = new GameOfLife(aliveCellsAtTimeZero);
        assertEquals(0, game.getAliveCells().size());
    }

//    TODO : Think more before naming
    @Test
    void givenTwoAliveCellsWhenCheckWillAliveThenShouldBeDead() {
        List<Cell> aliveCellsAtTimeZero = new ArrayList<>();
        Cell cellOne = new Cell(1, 2);
        Cell cellTwo = new Cell(2, 2);

        aliveCellsAtTimeZero.add(cellOne);
        aliveCellsAtTimeZero.add(cellTwo);

        GameOfLife game = new GameOfLife(aliveCellsAtTimeZero);

        List<Cell> aliveCellAtNextTime = new ArrayList<>();
        assertEquals(aliveCellAtNextTime, game.getAliveCells());
    }

    @Test
    void givenThreeAliveCellsWhenCheckWillAliveThenOneOfThemShouldBeAlive() {
        List<Cell> aliveCellsAtTimeZero = new ArrayList<>();
        Cell cellOne = new Cell(2, 2);
        Cell cellTwo = new Cell(3, 4);
        Cell cellThree = new Cell(2, 3);

        aliveCellsAtTimeZero.add(cellOne);
        aliveCellsAtTimeZero.add(cellTwo);
        aliveCellsAtTimeZero.add(cellThree);

        GameOfLife game = new GameOfLife(aliveCellsAtTimeZero);

        List<Cell> aliveCellAtNextTime = new ArrayList<>();
        aliveCellAtNextTime.add(cellThree);
        assertEquals(aliveCellAtNextTime, game.getAliveCells());
    }

    @Test
    void givenFourAliveCellsWhenCheckWillAliveThenShouldAlive() {
        List<Cell> aliveCellsAtTimeZero = new ArrayList<>();
        Cell cellOne = new Cell(2, 2);
        Cell cellTwo = new Cell(2, 3);
        Cell cellThree = new Cell(1, 2);
        Cell cellFour = new Cell(3, 3);
        Cell cellFive = new Cell(1, 3);
        Cell cellSix = new Cell(3, 2);

        aliveCellsAtTimeZero.add(cellOne);
        aliveCellsAtTimeZero.add(cellTwo);
        aliveCellsAtTimeZero.add(cellThree);
        aliveCellsAtTimeZero.add(cellFour);

        GameOfLife game = new GameOfLife(aliveCellsAtTimeZero);
        List<Cell> aliveCellsAtNextTime = new ArrayList<>();

        aliveCellsAtNextTime.add(cellOne);
        aliveCellsAtNextTime.add(cellTwo);
        aliveCellsAtNextTime.add(cellThree);
        aliveCellsAtNextTime.add(cellFive);
        aliveCellsAtNextTime.add(cellFour);
        aliveCellsAtNextTime.add(cellSix);
        assertEquals(aliveCellsAtNextTime.size(), game.getAliveCells().size());
    }

    @Test
    void  givenThreeAliveCellWhenCheckWillAliveYThenShoulAliveADeadCell() {
        List<Cell> aliveCellsAtTimeZero = new ArrayList<>();

        Cell cellOne = new Cell(2,3);
        Cell cellTwo = new Cell(2,2);
        Cell cellThree = new Cell(3,2);
        Cell cellFour = new Cell(3,1);

        aliveCellsAtTimeZero.add(cellOne);
        aliveCellsAtTimeZero.add(cellTwo);
        aliveCellsAtTimeZero.add(cellThree);

        GameOfLife game = new GameOfLife(aliveCellsAtTimeZero);

        List<Cell> aliveCellsAtNextTime = new ArrayList<>();
        aliveCellsAtNextTime.add(cellOne);
        aliveCellsAtNextTime.add(cellTwo);
        aliveCellsAtNextTime.add(cellThree);
        aliveCellsAtNextTime.add(cellFour);
        assertEquals(aliveCellsAtNextTime.size(),game.getAliveCells().size());
    }
}
