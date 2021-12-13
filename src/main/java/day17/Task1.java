package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece white = ChessPiece.PAWN_WHITE;
        ChessPiece black = ChessPiece.ROOK_BLACK;
        String[] chessPiece = {white.getName(), white.getName(), white.getName(), white.getName(),
                                black.getName(), black.getName(), black.getName(), black.getName()};

        for (String name : chessPiece) {
            System.out.print(name + " ");
        }
    }
}