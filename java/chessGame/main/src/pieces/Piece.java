package main.src.pieces;

import main.src.pieces.PiecesEnum;
import main.src.board.BoardEnum;

public class Piece {
    private PiecesEnum pieceTag;
    private PiecesEnum player;
    private BoardEnum xCoordinate;
    private BoardEnum yCoordinate;

    public Piece(PiecesEnum piece, PiecesEnum player, BoardEnum x, BoardEnum y)
    {
        setTag(piece);
        setPlayer(player);
        setXCoordinate(x);
        setYCoordinate(y);
    }

    private void setPieceTag(PiecesEnum piece) { pieceTag = piece; }
    private void setPlayer(PiecesEnum controller) { player = controller; }
    private void setXCoordinate(BoardEnum x) { xCoordinate = x; }
    private void setYCoordinate(BoardEnum y) { yCoordinate = y; }

    public PiecesEnum getPieceTag() { return pieceTag; }
    public PiecesEnum getPlayer() { return player; }
    public BoardEnum getXCoordinate() { return xCoordinate; }
    public BoardEnum getYCoordinate() { return yCoordinate; }
}
