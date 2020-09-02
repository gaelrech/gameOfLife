package main;

import java.util.LinkedList;

public class GameIterator {
    private CellCollection cellCollection;

    public GameIterator(CellCollection cellCollection) {
        this.cellCollection = cellCollection;
    }

    public void doIteration() {
        cellCollection.mutate();
    }

}
