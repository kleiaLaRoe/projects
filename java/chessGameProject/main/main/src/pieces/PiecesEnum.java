package main.src.pieces;

public enum PiecesEnum {
    PAWN("PAWN"), KNIGHT("KNIGHT"), ROOK("ROOK"), BISHOP("BISHOP"),
    KING("KING"), QUEEN("QUEEN"), BLACK("PLAYER1"), WHITE("PLAYER2");

    public final String label;

    private PiecesEnum(String label) { this.label = label; }
}
