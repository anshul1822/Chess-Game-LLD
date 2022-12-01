package piece;

import board.ChessBoard;
import cell.ChessCell;

public class Rook implements ChessPiece{
    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public void setDead(boolean isDead) {

    }

    @Override
    public PieceName getName() {
        return null;
    }
}
