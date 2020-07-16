package main.src.pieces;

public enum PiecesEnum {
    PAWN("PAWN"), KNIGHT("KNIGHT"), ROOK("ROOK"), BISHOP("BISHOP"),
<<<<<<< Updated upstream
    KING("KING"), QUEEN("QUEEN"), BLACK("PLAYER1"), WHITE("PLAYER2");
=======
    KING("KING"), QUEEN("QUEEN"), BLACK("PLAYER1"), WHITE("PLAYER2"), EMPTY("");
>>>>>>> Stashed changes

    public final String label;

    private PiecesEnum(String label) { this.label = label; }
}
