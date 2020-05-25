package main.src.pieces;

import main.src.pieces.Piece;
import main.src.pieces.PiecesEnum;

public class Movement {
    public Movement(){}

    public boolean valid(Piece piece)
    {
        if(piece != null)
        switch(piece.getPieceTag()) {
            default:
                return false;
        }
        return false;
    }
}
