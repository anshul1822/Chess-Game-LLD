package game;

import board.Board;
import board.ChessBoard;
import piece.PieceName;
import player.ChessPlayer;
import player.Player;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Chess extends BoardGame{

    private final ChessPlayer player1, player2;

    public Chess(ChessPlayer player1, ChessPlayer player2, ChessBoard chessBoard) {
        super(chessBoard, new ArrayDeque<Player>(Arrays.asList(player1, player2)));
        this.player1 = player1;
        this.player2 = player2;
        prepareBoard(this.player1, this.player2, chessBoard);

    }

    @Override
    public boolean isOver() {
        return player1.getPiece(PieceName.KING).isDead() ||
                player2.getPiece(PieceName.KING).isDead();
    }

    private void prepareBoard(ChessPlayer firstPlayer,
                              ChessPlayer secondPlayer, ChessBoard board){

        placePawns(1,board,firstPlayer);
        placePawns(6,board,secondPlayer);
        placeRooks(0,board,firstPlayer);
        placeRooks(7,board,secondPlayer);
        placeKnights(0,board,firstPlayer);
        placeKnights(7,board,secondPlayer);
        placeBishops(0,board,firstPlayer);
        placeBishops(7,board,secondPlayer);
        placeKing(0,board,firstPlayer);
        placeKing(7,board,secondPlayer);
        placeQueen(0,board,firstPlayer);
        placeQueen(7,board,secondPlayer);
    }

    private void placePawns(int row, ChessBoard board, ChessPlayer player){

        List<PieceName> pieceNames = Arrays.asList(PieceName.PAWN1, PieceName.PAWN2, PieceName.PAWN3,
                PieceName.PAWN4, PieceName.PAWN5, PieceName.PAWN6, PieceName.PAWN7, PieceName.PAWN8);

        int col = 0;
        for(PieceName pieceName : pieceNames){
            board.putPiece(player.getPiece(pieceName), row, col++);
        }
    }

    private void placeRooks(int row, ChessBoard board, ChessPlayer player){

        board.putPiece(player.getPiece(PieceName.ROOK1), row, 0);
        board.putPiece(player.getPiece(PieceName.ROOK2), row, 7);

    }

    private void placeKnights(int row, ChessBoard board, ChessPlayer player){

        board.putPiece(player.getPiece(PieceName.KNIGHT1), row, 1);
        board.putPiece(player.getPiece(PieceName.KNIGHT2), row, 6);
    }

    private void
}
