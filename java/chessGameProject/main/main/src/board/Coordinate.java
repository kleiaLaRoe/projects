package main.src.board;

<<<<<<< Updated upstream
public class Coordinate {
    private int x;
    private int y;

    public Coordinate(BoardEnum x, BoardEnum y)
    {
        setX(x); setY(y);
    }

    public Coordinate(int x, int y)
    {
        setX(x); setY(y);
    }

    private void setX(BoardEnum x) { this.x = x.position; }
    private void setY(BoardEnum y) { this.y = y.position; }

    private  void setX(int x) { this.x = x; }
    private  void setY(int y) { this.y = y; }

    public int getX() { return x; }
    public int getY() { return y; }
=======
import main.src.pieces.Piece;

public class Coordinate {
    private BoardEnum x;
    private BoardEnum y;
    private Piece piece;

    public Coordinate(BoardEnum x, BoardEnum y, Piece piece)
    {
        setX(x);
        setY(y);
        setPiece(piece);
    }

    private void setX(BoardEnum x) { this.x = x; }
    private void setY(BoardEnum y) { this.y = y; }
    public void setPiece(Piece piece) { this.piece = piece; }

    public BoardEnum getX() { return x; }
    public BoardEnum getY() { return y; }
    public Piece getPiece() { return piece; }

    public void updatePosition(BoardEnum x, BoardEnum y) { setX(x); setY(y);}
>>>>>>> Stashed changes
}
