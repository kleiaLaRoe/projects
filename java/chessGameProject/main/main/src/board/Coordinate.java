package main.src.board;

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
}
