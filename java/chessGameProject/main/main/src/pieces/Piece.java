package main.src.pieces;

import main.src.board.BoardEnum;
import main.src.board.Coordinate;

public class Piece {
    private PiecesEnum pieceTag;
    private PiecesEnum player;
    private BoardEnum xCoordinate;
    private BoardEnum yCoordinate;
    private BoardEnum xPrevCoordinate;
    private BoardEnum yPrevCoordinate;
    private Coordinate currPosition;
    private Coordinate prevPosition;

    public Piece(PiecesEnum piece, PiecesEnum player, BoardEnum x, BoardEnum y)
    {
        setPieceTag(piece);
        setPlayer(player);
        setXCoordinate(x);
        setYCoordinate(y);
        setPosition(new Coordinate(x, y));
        setPrevPosition(new Coordinate(x, y));
    }

    private void setPieceTag(PiecesEnum piece) { pieceTag = piece; }
    private void setPlayer(PiecesEnum controller) { player = controller; }
    private void setXCoordinate(BoardEnum x) { xCoordinate = x; }
    private void setYCoordinate(BoardEnum y) { yCoordinate = y; }
    private void setPreviousXCoordinate(BoardEnum x) { xPrevCoordinate = x; }
    private void setPreviousYCoordinate(BoardEnum y) { yPrevCoordinate = y; }
    private void setPosition(Coordinate pos) { currPosition = pos; }
    private void setPrevPosition(Coordinate pos) {prevPosition = pos; }

    public PiecesEnum getPieceTag() { return pieceTag; }
    public PiecesEnum getPlayer() { return player; }
    public BoardEnum getXCoordinate() { return xCoordinate; }
    public BoardEnum getPrevXCoordinate() { return xPrevCoordinate; }
    public BoardEnum getPrevYCoordinate() { return yPrevCoordinate; }
    public BoardEnum getYCoordinate() { return yCoordinate; }
    public Coordinate getPosition() { return currPosition; }
    public Coordinate getPrevPosition() { return prevPosition; }

    public void updatePosition(BoardEnum x, BoardEnum y)
    {
        setPreviousXCoordinate(getXCoordinate());
        setPreviousYCoordinate(getYCoordinate());
        setXCoordinate(x);
        setYCoordinate(y);
    }

    public boolean isMovingForward()
    {
        if(getPlayer() == PiecesEnum.BLACK)
        {
            return getYCoordinate().position > getPrevYCoordinate().position;
        }
        return getYCoordinate().position < getPrevYCoordinate().position;
    }
}
