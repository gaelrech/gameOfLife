package main;

public class CellLifeRules {

    public CellState applyRules(long numberOfNeighbors, Cell cell) {
        return
            numberOfNeighbors >= 2 && numberOfNeighbors <= 3 && cell.getState() == CellState.Alive ? CellState.Alive :
            numberOfNeighbors == 3 && cell.getState() == CellState.Dead ? CellState.Alive :
            CellState.Dead;
    }
}
