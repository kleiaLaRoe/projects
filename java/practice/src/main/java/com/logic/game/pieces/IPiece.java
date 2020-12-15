package com.logic.game.pieces;

import com.logic.game.board.IBoard;

public interface IPiece {
    boolean validMovement(ILocation location);
    void showPossibleMovement();
    void removePieceFromBoard(IBoard board);
    void getLocation();
}
