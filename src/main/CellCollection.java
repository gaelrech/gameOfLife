package main;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CellCollection {
    private LinkedList<Cell> cellDiagram;
    private final CellLifeRules cellLifeRules;

    public CellCollection(int[][] diagram, CellLifeRules cellLifeRules) {
        this.cellDiagram = createCellDiagram(diagram);
        this.cellLifeRules = cellLifeRules;
    }

    private LinkedList<Cell> createCellDiagram(int[][] diagram) {
        return IntStream
                .range(0, diagram.length)
                .boxed()
                .flatMap(row -> IntStream
                    .range(0, diagram[row].length)
                    .mapToObj(col -> new int[] {row, col})
                )
                .map(cord -> new Cell(cord[0],cord[1],diagram[cord[0]][cord[1]] == 0 ? CellState.Dead : CellState.Alive))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    public long getNumberOfNeighbours(Cell cell){
        return cellDiagram
                .stream()
                .filter(cell::isNeighbour)
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
        if (!(o instanceof CellCollection)) return false;

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
