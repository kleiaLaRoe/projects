package main.src.pieces;

import main.src.board.Board;
import main.src.board.Coordinate;

public class Movement {

    private Board board;
    public Movement(Board gameBoard){
        setBoard(gameBoard);
    }

    public Movement(){};

    private void setBoard(Board gameBoard) { board = gameBoard; }
    public void updateBoard(Board gameBoard) { setBoard(gameBoard); }

    public boolean validMovement(Piece piece)
    {
        if(piece != null) {
            switch (piece.getPieceTag()) {
                case KING:
                    return distance(piece.getPosition(), piece.getPrevPosition()) == 1;
                case QUEEN:
                    return slope(piece.getPosition(), piece.getPrevPosition()) == 1
                            || slope(piece.getPosition(), piece.getPrevPosition()) == 0;
                case BISHOP:
                    return slope(piece.getPosition(), piece.getPrevPosition()) == 1;
                case KNIGHT:
                    return (slope(piece.getPosition(), piece.getPrevPosition()) == 2
                            || slope(piece.getPosition(), piece.getPrevPosition()) == 0.5)
                            && distance(piece.getPosition(), piece.getPrevPosition()) == 1.5;
                case ROOK:
                    return slope(piece.getPosition(), piece.getPrevPosition()) == 0;
                case PAWN:
                    return distance(piece.getPosition(), piece.getPrevPosition()) == 1 ||
                            slope(piece.getPosition(), piece.getPrevPosition()) == 1
                                    && board.isOccupiedByOpponent(piece.getPlayer(), piece.getPosition())
                                    && piece.isMovingForward();
                default:
                    return false;
            }
        }
        return false;
    }

    private double distance(Coordinate current, Coordinate prev)
    {
        if(current.getY() != prev.getY() && current.getX() != prev.getX())
            return 0.5 * (Math.abs(current.getX() - prev.getX()) + Math.abs(current.getY() - prev.getY()));
        return (Math.abs(current.getX() - prev.getX()) + Math.abs(current.getY() - prev.getY()));
    }

    private double slope(Coordinate current, Coordinate prev)
    {
        if(current.getX() - prev.getX() == 0)
            return 0;
        return Math.abs(current.getY() - prev.getY()) / Math.abs(current.getX() - prev.getX());

    }
}
