package chess.service.strategy;

import chess.enums.PieceType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RookMoveStrategyTest {

    private final RookMoveStrategy strategy = new RookMoveStrategy();

    @Test
    void pieceTypeHandler() {
        //given
        PieceType expected = PieceType.ROOK;

        //when
        PieceType actual = strategy.pieceTypeHandler();

        //then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void canBeMoved_contradicting_logic_test() {
        //given
        int x1 = 0;
        int y1 = 2;
        int x2 = 6;
        int y2 = 2;

        //when
        boolean actual = strategy.canBeMoved(x1, y1, x2, y2);

        //then
        Assertions.assertFalse(actual);
    }


    @Test
    void canBeMoved_vertical_move_test() {
        //given
        int x1 = 0;
        int y1 = 2;
        int x2 = 6;
        int y2 = 2;

        //when
        boolean actual = strategy.canBeMoved(x1, y1, x2, y2);

        //then
        Assertions.assertFalse(actual);
    }
}