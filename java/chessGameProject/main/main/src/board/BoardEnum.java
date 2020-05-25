package main.src.board;

public enum BoardEnum {
    A(0), B(1), C(2), D(3), E(4), F(5), G(6), H(7),
    ONE(0), TWO(1), THREE(2), FOUR(3), FIVE(4), SIX(5), SEVEN(6), EIGHT(7);

    public final int position;

    private BoardEnum(int pos) { this.position = pos; }

}
