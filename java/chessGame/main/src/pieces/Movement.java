package main.src.pieces;

import main.src.pieces.Piece;
import main.src.pieces.PiecesEnum;
import main.src.board.Coordinate;

public class Movement {
    public Movement(){}

    public boolean valid(Piece piece)
    {
        if(piece != null)
        switch(piece.getTag()) {
            case PiecesEnum.PAWN:
            case PiecesEnum.ROOK:
            case PiecesEnum.KNIGHT:
            case PiecesEnum.BISHOP:
            case PiecesEnum.QUEEN:
            case PiecesEnum.KING:
            default:
                return false;
        }
        return false;
    }
}
