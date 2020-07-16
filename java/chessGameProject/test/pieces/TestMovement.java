package pieces;

<<<<<<< Updated upstream

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

=======
import main.src.board.Board;
import main.src.board.Coordinate;
import main.src.pieces.Movement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMovement {
    Movement movement;
    Board board;
    Coordinate coordinate;

    @BeforeEach
    private void setup()
    {
        movement = new Movement();
        board = new Board();
    }

    @Test
    public void movement_possibleKingMoves() {}

    @Test
    public void movement_possibleKingMovesWhileInCheck() {}

    @Test
    public void movement_possibleKingMovesWhileInCheckmate() {}

    @Test
    public void movement_possibleQueenMoves() {}

    @Test
    public void movement_possibleQueenMovesAllyPiece() {}

    @Test
    public void movement_possibleQueenMovesOpponentPiece() {}

    @Test
    public void movement_possibleBishopMoves() {}

    @Test
    public void movement_possibleBishopMovesAllyPiece() {}

    @Test
    public void movement_possibleBishopMovesOpponentPiece() {}

    @Test
    public void movement_possibleKnightMoves() {}

    @Test
    public void movement_possibleKnightMovesAllyPiece() {}

    @Test
    public void movement_possibleKnightMovesOpponentPiece() {}

    @Test
    public void movement_possibleRookMoves() {}

    @Test
    public void movement_possibleRookMovesAllyPiece() {}

    @Test
    public void movement_possibleRookMovesOpponentPiece() {}

    @Test
    public void movement_pawnOnlyMovesForwardIfNoOpponentPiece() {}

    @Test
    public void movement_possiblePawnMovesWhenOpponentPieceIsNear() {}

    @Test
    public void movemnt_possiblePawnMovesAllyPiece() {}
>>>>>>> Stashed changes
}
