package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = OccupiedCellException.class)
    public void moveFromLeftToRightFromBottomToTop()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.D2));
        logic.move(Cell.C1, Cell.E3);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void moveFromLeftToRightFromTopToBottom()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.E5));
        logic.move(Cell.E5, Cell.F5);
    }

    @Test(expected = FigureNotFoundException.class)
    public void moveFromRightToLeftFromTopToBottom()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.B5));
        logic.move(Cell.B6, Cell.C4);
    }
}