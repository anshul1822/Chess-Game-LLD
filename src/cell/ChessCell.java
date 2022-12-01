package cell;

import piece.ChessPiece;

import java.util.Optional;


public class ChessCell {

    private final int x;
    private final int y;
    private Optional<ChessPiece> chessPieceOptional;

    public ChessCell(int x, int y) {
        this.x = x;
        this.y = y;
        chessPieceOptional = Optional.empty();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Optional<ChessPiece> getChessPieceOptional() {
        return chessPieceOptional;
    }

    public void setChessPieceOptional(Optional<ChessPiece> chessPieceOptional) {
        this.chessPieceOptional = chessPieceOptional;
    }
}
