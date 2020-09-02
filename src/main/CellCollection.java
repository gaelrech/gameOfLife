package main;

import com.sun.jdi.ByteValue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.range;

public class CellCollection {
    private LinkedList<Cell> cellDiagram;
    private CellLifeRules cellLifeRules;

    public CellCollection(byte[][] diagram, CellLifeRules cellLifeRules) {
        this.cellDiagram = createCellDiagram(diagram);
        this.cellLifeRules = cellLifeRules;
    }

    private LinkedList<Cell> createCellDiagram(byte[][] diagram) {
        var cellDiagram = new LinkedList<Cell>();
        for (int i = 0; i < diagram.length; i++) {
            for (int j = 0; j < diagram[i].length; j++) {
                cellDiagram.add(new Cell(i, j, diagram[i][j] == 0 ? CellState.Dead : CellState.Alive));
            }
        }
        return cellDiagram;
    }

    public long getNumberOfNeighbours(Cell cell){
        return cellDiagram
                .stream()
                .filter(c -> cell.isNeighbour(c) == true)
                .count();
    }

    public void mutate() {
        cellDiagram = cellDiagram
                .stream()
                .map(c -> c.mutate(cellLifeRules.applyRules(getNumberOfNeighbours(c), c)))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    public LinkedList<Cell> getCellDiagram(){
        return cellDiagram;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CellCollection)) {
            return false;
        }

        CellCollection target = (CellCollection) o;
        AtomicInteger counter = new AtomicInteger(0);

        return cellDiagram
                .stream()
                .allMatch(object -> object
                        .equals(target.cellDiagram
                                .get(counter
                                        .getAndIncrement())));
    }
}
