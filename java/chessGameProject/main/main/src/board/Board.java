package main.src.board;

import main.src.pieces.Piece;
import main.src.pieces.PiecesEnum;

import java.util.ArrayList;

public class Board {
    private ArrayList<Piece> board;

    public ArrayList<Piece> getBoard() { return board; }

    public boolean isOccupiedByOpponent(PiecesEnum player, Coordinate pos)
    {
        return !(getBoard().get(pos.getX()*pos.getY() + pos.getX()).getPlayer() == player);
    }
}
