package pieces;


import main.src.board.BoardEnum;
import main.src.pieces.Movement;
import main.src.pieces.Piece;
import main.src.pieces.PiecesEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMovement {
    @Test
    public void testPieceIsNull()
    {
        // set up
        Movement movement = new Movement();

        // test
        boolean validMove = movement.validMovement(null);

        // validation
        assertFalse(validMove);
    }

    @Test
    public void testPieceTagIncorrect()
    {
        // set up
        Movement move = new Movement();
        Piece piece = new Piece(PiecesEnum.BLACK, PiecesEnum.WHITE, BoardEnum.ONE, BoardEnum.A);

        // test
        boolean validMove = move.validMovement(piece);

        // validation
        assertFalse(validMove);
    }

    @Test
    public void testValidKingMovementOneSpaceUp()
    {
        // set up
        Movement move = new Movement();
        Piece piece = new Piece(PiecesEnum.KING, PiecesEnum.WHITE, BoardEnum.ONE, BoardEnum.A);
        piece.updatePosition(BoardEnum.TWO, BoardEnum.A);

        // test
        boolean validMove = move.validMovement(piece);

        // validation
        assertTrue(validMove);
    }

    @Test
    public void testValidKingMovementOneSpaceDiagonally()
    {
        // set up
        Movement move = new Movement();
        Piece piece = new Piece(PiecesEnum.KING, PiecesEnum.WHITE, BoardEnum.ONE, BoardEnum.A);
        piece.updatePosition(BoardEnum.TWO, BoardEnum.B);

        // test
        boolean validMove = move.validMovement(piece);

        // validation
        assertTrue(validMove);
    }

    @Test
    public void testInvalidKingMovementOneSpaceUp()
    {
        // set up
        Movement move = new Movement();
        Piece piece = new Piece(PiecesEnum.KING, PiecesEnum.WHITE, BoardEnum.ONE, BoardEnum.A);
        piece.updatePosition(BoardEnum.TWO, BoardEnum.C);

        // test
        boolean validMove = move.validMovement(piece);

        // validation
        assertFalse(validMove);
    }
    @Test
    public void testInvalidKingMovementDiagonally()
    {
        // set up
        Movement move = new Movement();
        Piece piece = new Piece(PiecesEnum.KING, PiecesEnum.WHITE, BoardEnum.ONE, BoardEnum.A);
        piece.updatePosition(BoardEnum.TWO, BoardEnum.D);

        // test
        boolean validMove = move.validMovement(piece);

        // validation
        assertFalse(validMove);
    }

}
