package player;

import board.ChessBoard;
import data.Move;
import piece.ChessPiece;
import piece.PieceName;

import java.util.Map;

public class ComputerChessPlayer extends ChessPlayer{


    public ComputerChessPlayer(Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard, String name) {
        super(pieces, chessBoard, name);
    }

    @Override
    public Move makeMove() {
        return null;
    }
}
