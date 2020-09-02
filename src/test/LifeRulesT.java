package test;

import main.Cell;
import main.CellLifeRules;
import main.CellState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LifeRulesT {
    @Test
    public void lessThanTwoNeighborsAlive(){
        var numberOfNeighbors = 1;
        Cell cell = new Cell(0,0, CellState.Alive);
        CellState currentState = new CellLifeRules().applyRules(numberOfNeighbors, cell);

        assertEquals(CellState.Dead, currentState);
    }
    @Test
    public void moreThanThreeNeighborsAlive(){
        var numberOfNeighbors = 4;
        Cell cell = new Cell(0,0, CellState.Alive);
        CellState currentState = new CellLifeRules().applyRules(numberOfNeighbors, cell);

        assertEquals(CellState.Dead, currentState);
    }
    @Test
    public void exactlyThreeNeighborsAlive(){
        var numberOfNeighbors = 3;
        Cell cell = new Cell(0,0, CellState.Dead);
        CellState currentState = new CellLifeRules().applyRules(numberOfNeighbors, cell);

        assertEquals(CellState.Alive, currentState);
    }
    @Test
    public void exactlyTwoNeighborsAlive(){
        var numberOfNeighbors = 2;
        Cell cell = new Cell(0,0, CellState.Alive);
        CellState currentState = new CellLifeRules().applyRules(numberOfNeighbors, cell);

        assertEquals(CellState.Alive, currentState);
    }
}