package main;

import java.lang.ref.Cleaner;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import static java.lang.Math.abs;

public class Cell {
    private int x;
    private int y;
    private CellState state;

    public Cell(int y, int x, CellState state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public boolean isNeighbour(Cell possibleNeighbour){
        if (possibleNeighbour.getState() == CellState.Dead){
            return false;
        }
        return
            isWithinOneTileOfDistance(x, possibleNeighbour.getX()) &&
            isWithinOneTileOfDistance(y, possibleNeighbour.getY()) &&
            isNotTheSameCell(possibleNeighbour, this);
    }
    private boolean isWithinOneTileOfDistance (int currentCell, int targetCell){
        return abs(currentCell - targetCell) <=1;
    }
    private boolean isNotTheSameCell(Cell currentCell, Cell targetCell){
        return !(abs(currentCell.getY() - targetCell.getY()) == 0 && abs(currentCell.getX() - targetCell.getX()) == 0);
    }
    public Cell mutate (CellState cellState){
        return new Cell(this.y,this.x,cellState);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public CellState getState() {
        return state;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cell)) {
            return false;
        }

        Cell target = (Cell) o;
        return (target.getX() == x && target.getY() == y && target.getState() == state);
    }

}
