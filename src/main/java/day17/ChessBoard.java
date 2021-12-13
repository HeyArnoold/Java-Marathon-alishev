package day17;

public class ChessBoard {
    private ChessPiece [][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print() {
        for (int i = 0; i < chessBoard.length; i++) {

            for (int j = 0; j < chessBoard[i].length; j++) {

                System.out.print(chessBoard[i][j].getName());
            }
            System.out.println();
        }
    }
}
