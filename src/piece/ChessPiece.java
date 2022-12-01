package piece;

import board.ChessBoard;
import cell.ChessCell;

public interface ChessPiece {

    void move(ChessCell source, ChessCell destination, ChessBoard chessBoard);

    boolean isDead();

    Color getColor();
    void setDead(boolean isDead);

    PieceName getName();
}
