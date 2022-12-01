package piece;

import board.ChessBoard;
import cell.ChessCell;

public class Knight implements ChessPiece{

    private final PieceName pieceName;
    private final Color color;
    private boolean isDead;

    public Knight(PieceName pieceName, Color color, boolean isDead) {
        this.pieceName = pieceName;
        this.color = color;
        this.isDead = isDead;
    }

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

        int x_diff = Math.abs(source.getX() - destination.getX());
        int y_diff = Math.abs(source.getY() - destination.getY());

        //Legal Move
        if( !(Math.max(x_diff, y_diff) == 2 && Math.min(x_diff, y_diff) == 1)){
            throw new RuntimeException("Invalid Move");
        }

        if(destination.getChessPieceOptional().isPresent()){
            if(destination.getChessPieceOptional().get().getColor().equals(this.color)){
                throw new RuntimeException("Destination Invalid");
            }else{
                destination.getChessPieceOptional().get().setDead(true);
            }
        }



    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setDead(boolean isDead) {

    }

    @Override
    public PieceName getName() {
        return null;
    }
}
