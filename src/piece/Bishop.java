package piece;

import board.ChessBoard;
import cell.ChessCell;

import java.awt.Color;

public class Bishop implements ChessPiece{

    private final PieceName pieceName;
    private final Color color;
    private boolean isDead;

    public Bishop(PieceName pieceName, Color color, boolean isDead){

        this.pieceName = pieceName;
        this.color = color;
        this.isDead = isDead;
    }

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
