import board.ChessBoard;
import game.BoardGame;
import game.Chess;
import piece.Bishop;
import piece.ChessPiece;
import piece.PieceName;
import player.ChessPlayer;
import player.HumanChessPlayer;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ChessBoard chessBoard = new ChessBoard();
        ChessPlayer firstPlayer = new HumanChessPlayer(getPieces(Color.WHITE), chessBoard, "Vivek");
        ChessPlayer secondPlayer = new HumanChessPlayer(getPieces(Color.BLACK), chessBoard, "Bharat");

        BoardGame chessBoardGame = new Chess(firstPlayer, secondPlayer, chessBoard);
        chessBoardGame.startGame();
    }

    private static Map<PieceName, ChessPiece> getPieces(Color color){

        Map<PieceName, ChessPiece> pieces = new HashMap<>();


        pieces.put(PieceName.BISHOP1, new Bishop(PieceName.BISHOP1, color, false));
        pieces.put(PieceName.BISHOP2, new Bishop(PieceName.BISHOP2, color, false));
        pieces.put(PieceName.KNIGHT1, new Bishop(PieceName.KNIGHT1, color, false));
        pieces.put(PieceName.KNIGHT2, new Bishop(PieceName.KNIGHT2, color, false));
        pieces.put(PieceName.ROOK1, new Bishop(PieceName.ROOK1, color, false));
        pieces.put(PieceName.ROOK2, new Bishop(PieceName.ROOK2, color, false));
        pieces.put(PieceName.KING, new Bishop(PieceName.KING, color, false));
        pieces.put(PieceName.QUEEN, new Bishop(PieceName.QUEEN, color, false));
        pieces.put(PieceName.PAWN1, new Bishop(PieceName.PAWN1, color, false));
        pieces.put(PieceName.PAWN2, new Bishop(PieceName.PAWN2, color, false));
        pieces.put(PieceName.PAWN3, new Bishop(PieceName.PAWN3, color, false));
        pieces.put(PieceName.PAWN4, new Bishop(PieceName.PAWN4, color, false));
        pieces.put(PieceName.PAWN5, new Bishop(PieceName.PAWN5, color, false));
        pieces.put(PieceName.PAWN6, new Bishop(PieceName.PAWN6, color, false));
        pieces.put(PieceName.PAWN7, new Bishop(PieceName.PAWN7, color, false));
        pieces.put(PieceName.PAWN8, new Bishop(PieceName.PAWN8, color, false));







        return pieces;


    }
}