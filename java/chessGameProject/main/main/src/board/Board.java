package main.src.board;

import main.src.pieces.Piece;
import main.src.pieces.PiecesEnum;

<<<<<<< Updated upstream
import java.util.ArrayList;

public class Board {
    private ArrayList<Piece> board;

    public ArrayList<Piece> getBoard() { return board; }

    public boolean isOccupiedByOpponent(PiecesEnum player, Coordinate pos)
    {
        return !(getBoard().get(pos.getX()*pos.getY() + pos.getX()).getPlayer() == player);
=======
import java.util.EnumSet;
import java.util.Set;

public class Board {
    private Coordinate[][] board;

    Set<BoardEnum> boardColumn = EnumSet.of(BoardEnum.A, BoardEnum.B, BoardEnum.C, BoardEnum.D,
            BoardEnum.E, BoardEnum.F, BoardEnum.G, BoardEnum.H);
    Set<BoardEnum> boardRow = EnumSet.of(BoardEnum.ONE, BoardEnum.TWO, BoardEnum.THREE, BoardEnum.FOUR,
            BoardEnum.FIVE, BoardEnum.SIX, BoardEnum.SEVEN, BoardEnum.EIGHT);

    public Board()
    {
        board = new Coordinate[8][8];
        populateBoard();
    }

    private void populateBoard(){
        for(BoardEnum col : boardColumn) {
            for (BoardEnum row : boardRow) {
                if(row == BoardEnum.TWO || row == BoardEnum.SEVEN) {
                    board[row.getPosition()][col.getPosition()] =
                            new Coordinate(row, col, new Piece(PiecesEnum.PAWN, row == BoardEnum.TWO ? PiecesEnum.WHITE : PiecesEnum.BLACK));
                }
                else if (row == BoardEnum.ONE || row == BoardEnum.EIGHT) {
                    if (col == BoardEnum.A || col == BoardEnum.H)
                        board[row.getPosition()][col.getPosition()] =
                                new Coordinate(row, col, new Piece(PiecesEnum.ROOK, row == BoardEnum.TWO ? PiecesEnum.WHITE : PiecesEnum.BLACK));
                    else if (col == BoardEnum.B || col == BoardEnum.G)
                        board[row.getPosition()][col.getPosition()] =
                                new Coordinate(row, col, new Piece(PiecesEnum.KNIGHT, row == BoardEnum.TWO ? PiecesEnum.WHITE : PiecesEnum.BLACK));
                    else if (col == BoardEnum.C || col == BoardEnum.F)
                        board[row.getPosition()][col.getPosition()] =
                                new Coordinate(row, col, new Piece(PiecesEnum.BISHOP, row == BoardEnum.TWO ? PiecesEnum.WHITE : PiecesEnum.BLACK));
                    else if (col == BoardEnum.D)
                        board[row.getPosition()][col.getPosition()] =
                                new Coordinate(row, col, new Piece(PiecesEnum.QUEEN, row == BoardEnum.TWO ? PiecesEnum.WHITE : PiecesEnum.BLACK));
                    else
                        board[row.getPosition()][col.getPosition()] =
                                new Coordinate(row, col, new Piece(PiecesEnum.KING, row == BoardEnum.TWO ? PiecesEnum.WHITE : PiecesEnum.BLACK));
                }
                else
                    board[row.getPosition()][col.getPosition()] = new Coordinate(row, col, new Piece(PiecesEnum.EMPTY, null));
            }
        }
    }

    public void setPiece(Piece piece, Coordinate pos) {
        board[pos.getX().getPosition()][pos.getY().getPosition()].setPiece(piece);
    }

    public Coordinate[][] getBoard() { return board; }

    public boolean isOccupiedByOpponent(Coordinate space, Piece piece) {
        return space.getPiece().getPlayer() != piece.getPlayer();
    }

    public boolean isOccupiedBySelf(Coordinate space, Piece piece) {
        return space.getPiece().getPlayer() == piece.getPlayer();
    }

    public void resetBoard() {
        populateBoard();
>>>>>>> Stashed changes
    }
}
