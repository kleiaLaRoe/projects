package main.src.pieces;

<<<<<<< Updated upstream
import main.src.board.BoardEnum;
=======
>>>>>>> Stashed changes
import main.src.board.Coordinate;

public class Piece {
    private PiecesEnum pieceTag;
    private PiecesEnum player;
<<<<<<< Updated upstream
    private Coordinate currPosition;
    private Coordinate prevPosition;

    public Piece(PiecesEnum piece, PiecesEnum player, BoardEnum x, BoardEnum y)
    {
        setPieceTag(piece);
        setPlayer(player);
        setPosition(new Coordinate(x, y));
        setPrevPosition(new Coordinate(x, y));
=======
    private Coordinate[] validMoves;

    public Piece(PiecesEnum piece, PiecesEnum player)
    {
        setPieceTag(piece);
        setPlayer(player);
>>>>>>> Stashed changes
    }

    private void setPieceTag(PiecesEnum piece) { pieceTag = piece; }
    private void setPlayer(PiecesEnum controller) { player = controller; }
<<<<<<< Updated upstream
    private void setPosition(Coordinate pos) { currPosition = pos; }
    private void setPrevPosition(Coordinate pos) {prevPosition = pos; }

    public PiecesEnum getPieceTag() { return pieceTag; }
    public PiecesEnum getPlayer() { return player; }
    public Coordinate getPosition() { return currPosition; }
    public Coordinate getPrevPosition() { return prevPosition; }

    public void updatePosition(BoardEnum x, BoardEnum y)
    {
        setPrevPosition(new Coordinate(getPosition().getX(), getPosition().getY()));
        setPosition(new Coordinate(x, y));
    }

    public boolean isMovingForward()
    {
        if(getPlayer() == PiecesEnum.BLACK)
        {
            return getPosition().getY() > getPrevPosition().getY();
        }
        return getPosition().getY() < getPrevPosition().getY();
    }
=======
    public void setValidMoves(Coordinate[] moves) { validMoves = moves; }

    public PiecesEnum getPieceTag() { return pieceTag; }
    public PiecesEnum getPlayer() { return player; }
    public  Coordinate[] getValidMoves() { return validMoves; }

    public boolean isInCheck() { return false; }
    public boolean isInCheckmate() { return false; }
>>>>>>> Stashed changes
}
