package main.src.pieces;

import main.src.board.Board;
import main.src.board.Coordinate;

public class Movement {

    private Board board;
<<<<<<< Updated upstream
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
=======
    public Movement(Board gameBoard){ setBoard(gameBoard); }

    public Movement(){ setBoard(new Board()); }

    private void setBoard(Board gameBoard) { board = gameBoard; }
    public Board getBoard() { return board; }
    public void updateBoard(Board gameBoard) { setBoard(gameBoard); }

    public Coordinate[] validMovement(Coordinate space)
    {
        if(space != null) {
            switch (space.getPiece().getPieceTag()) {
                case KING:
                case QUEEN:
                case BISHOP:
                case KNIGHT:
                case ROOK:
                case PAWN:
                default:
                    return null;
            }
        }
        return null;
>>>>>>> Stashed changes
    }

    private double distance(Coordinate current, Coordinate prev)
    {
        if(current.getY() != prev.getY() && current.getX() != prev.getX())
<<<<<<< Updated upstream
            return 0.5 * (Math.abs(current.getX() - prev.getX()) + Math.abs(current.getY() - prev.getY()));
        return (Math.abs(current.getX() - prev.getX()) + Math.abs(current.getY() - prev.getY()));
=======
            return 0.5 * (Math.abs(current.getX().getPosition() - prev.getX().getPosition())
                    + Math.abs(current.getY().getPosition() - prev.getY().getPosition()));
        return (Math.abs(current.getX().getPosition() - prev.getX().getPosition())
                + Math.abs(current.getY().getPosition() - prev.getY().getPosition()));
>>>>>>> Stashed changes
    }

    private double slope(Coordinate current, Coordinate prev)
    {
<<<<<<< Updated upstream
        if(current.getX() - prev.getX() == 0)
            return 0;
        return Math.abs(current.getY() - prev.getY()) / Math.abs(current.getX() - prev.getX());

    }
}
=======
        if(current.getX().getPosition() - prev.getX().getPosition() == 0)
            return 0;
        return (double)Math.abs(current.getY().getPosition() - prev.getY().getPosition())
                / (double)Math.abs(current.getX().getPosition() - prev.getX().getPosition());
    }
}
>>>>>>> Stashed changes
