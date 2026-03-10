package lab2.Problem2;

public class Bishop extends Piece {

    public Bishop(Position currentPosition) {
        super(currentPosition);
    }

    @Override
    public boolean isLegalMove(Position targetPosition) {
        return Math.abs(currentPosition.row - targetPosition.row) ==
               Math.abs(currentPosition.col - targetPosition.col);
    }
}
