package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertEquals(Cell.C1, bishopBlack.position());
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertEquals(Cell.E3, bishopBlack.copy(Cell.E3).position());
    }

    @Test
    public void wayToRightUp() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(steps, bishopBlack.way(Cell.G5));
    }

    @Test
    public void wayToRightDown() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B7);
        Cell[] steps = {Cell.C6, Cell.D5, Cell.E4, Cell.F3};
        assertArrayEquals(steps, bishopBlack.way(Cell.F3));
    }

    @Test
    public void wayToLeftDown() {
        BishopBlack bishopBlack = new BishopBlack(Cell.H4);
        Cell[] steps = {Cell.G3, Cell.F2};
        assertArrayEquals(steps, bishopBlack.way(Cell.F2));
    }

    @Test
    public void wayToLeftUp() {
        BishopBlack bishopBlack = new BishopBlack(Cell.H4);
        Cell[] steps = {Cell.G5, Cell.F6, Cell.E7, Cell.D8};
        assertArrayEquals(steps, bishopBlack.way(Cell.D8));
    }
}