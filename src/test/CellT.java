package test;

import main.Cell;
import main.CellState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellT {
    @Test
    public void Neighbour__sameXDiffY(){
        var possibleNeighbour = new Cell(1,0, CellState.Alive);
        var currentCell = new Cell(0,0, CellState.Alive);

        var result = currentCell.isNeighbour(possibleNeighbour);

        assertEquals(true, result);
    }
}
