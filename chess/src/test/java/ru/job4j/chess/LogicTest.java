package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test
    public void moveFromLeftToRightFromBottomToTop()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C3));
        logic.move(Cell.C3, Cell.D2);
    }

    @Test
    public void moveFromLeftToRightFromTopToBottom()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.D2));
        logic.move(Cell.D2, Cell.C3);
    }

    @Test
    public void moveFromRightToLeftFromBottomToTop()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F1));
        logic.move(Cell.F1, Cell.A6);
    }

    @Test
    public void moveFromRightToLeftFromTopToBottom()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.B5));
        logic.move(Cell.B5, Cell.C4);
    }
}