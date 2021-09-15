package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void positionC8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertEquals(bishopBlack.position(), Cell.C8);
    }

    @Test
    public void copyC8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertTrue(bishopBlack.position().getX() == 2 && bishopBlack.position().getY() == 0);
    }

    @Test
    public void wayC1G5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.G5);
        assertArrayEquals(way, new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5});
    }
}