package lab2.Problem2;

public class Pawn extends Piece {

    public Pawn(Position currentPosition) {
        super(currentPosition);
    }

    @Override
    public boolean isLegalMove(Position targetPosition) {
        return targetPosition.row == currentPosition.row + 1 &&
               targetPosition.col == currentPosition.col;
    }
}
