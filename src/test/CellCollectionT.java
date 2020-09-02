package test;

import main.CellCollection;
import main.CellLifeRules;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellCollectionT {
    @Test
    public void stillLife__block(){
        byte [][] diagram = new byte[][]{
                { 0, 0, 0, 0 },
                { 0, 1, 1, 0 },
                { 0, 1, 1, 0 },
                { 0, 0, 0, 0 }
        };
        byte [][] expectedDiagram = new byte[][]{
                { 0, 0, 0, 0 },
                { 0, 1, 1, 0 },
                { 0, 1, 1, 0 },
                { 0, 0, 0, 0 }
        };
        CellCollection cellCollection = new CellCollection(diagram, new CellLifeRules());
        CellCollection expectedCellCollection = new CellCollection(expectedDiagram, new CellLifeRules());
        cellCollection.mutate();

        assertTrue(cellCollection.equals(expectedCellCollection));

    }
    @Test
    public void stillLife__beeHive(){
        byte [][] diagram = new byte[][]{
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 0 },
                { 0, 0, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0 }
        };
        byte [][] expectedDiagram = new byte[][]{
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 0 },
                { 0, 0, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0 }
        };
        CellCollection cellCollection = new CellCollection(diagram, new CellLifeRules());
        CellCollection expectedCellCollection = new CellCollection(expectedDiagram, new CellLifeRules());
        cellCollection.mutate();

        assertTrue(cellCollection.equals(expectedCellCollection));

    }
    @Test
    public void oscillators__blinker__1(){
        byte [][] diagram = new byte[][]{
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };
        byte [][] expectedDiagram = new byte[][]{
                { 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };
        CellCollection cellCollection = new CellCollection(diagram, new CellLifeRules());
        CellCollection expectedCellCollection = new CellCollection(expectedDiagram, new CellLifeRules());
        cellCollection.mutate();

        assertTrue(cellCollection.equals(expectedCellCollection));

    }
    @Test
    public void oscillators__blinker__2(){
        byte [][] diagram = new byte[][]{
                { 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };
        byte [][] expectedDiagram = new byte[][]{
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };
        CellCollection cellCollection = new CellCollection(diagram, new CellLifeRules());
        CellCollection expectedCellCollection = new CellCollection(expectedDiagram, new CellLifeRules());
        cellCollection.mutate();

        assertTrue(cellCollection.equals(expectedCellCollection));

    }
    @Test
    public void oscillators__toad__1(){
        byte [][] diagram = new byte[][]{
                { 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0},
                { 0, 0, 1, 1, 1, 0},
                { 0, 1, 1, 1, 0, 0},
                { 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0}
        };
        byte [][] expectedDiagram = new byte[][]{
                { 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 1, 0, 0},
                { 0, 1, 0, 0, 1, 0},
                { 0, 1, 0, 0, 1, 0},
                { 0, 0, 1, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0}
        };
        CellCollection cellCollection = new CellCollection(diagram, new CellLifeRules());
        CellCollection expectedCellCollection = new CellCollection(expectedDiagram, new CellLifeRules());
        cellCollection.mutate();

        assertTrue(cellCollection.equals(expectedCellCollection));

    }
    @Test
    public void oscillators__pulsar__1(){
        byte [][] diagram = new byte[][]{
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,1,1,0,0,1,1,0,1,1,0,0,1,1,1,0},
                {0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0},
                {0,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,0},
                {0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0},
                {0,1,1,1,0,0,1,1,0,1,1,0,0,1,1,1,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        byte [][] expectedDiagram = new byte[][]{
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0},
                {0,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,0},
                {0,0,1,0,0,1,0,1,0,1,0,1,0,0,1,0,0},
                {0,0,1,1,1,0,1,1,0,1,1,0,1,1,1,0,0},
                {0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0},
                {0,0,1,1,1,0,1,1,0,1,1,0,1,1,1,0,0},
                {0,0,1,0,0,1,0,1,0,1,0,1,0,0,1,0,0},
                {0,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,0},
                {0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        CellCollection cellCollection = new CellCollection(diagram, new CellLifeRules());
        CellCollection expectedCellCollection = new CellCollection(expectedDiagram, new CellLifeRules());
        cellCollection.mutate();

        var cellDiagramIterator = cellCollection.getCellDiagram().iterator();
        var expectedCellDiagramIterator = expectedCellCollection.getCellDiagram().iterator();

        while (cellDiagramIterator.hasNext() && expectedCellDiagramIterator.hasNext()){
            var actual = cellDiagramIterator.next();
            var expected = expectedCellDiagramIterator.next();
            String error = "Actual: " + actual.getY() + actual.getX() + actual.getState() + " Expected: " + expected.getY() + expected.getX() + expected.getState();

            assertTrue(actual.equals(expected), error);
        }
    }
}