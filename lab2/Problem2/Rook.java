package lab2.Problem2;

public class Rook extends Piece {

    public Rook(Position currentPosition) {
        super(currentPosition);
    }

    @Override
    public boolean isLegalMove(Position targetPosition) {
        return currentPosition.row == targetPosition.row ||
               currentPosition.col == targetPosition.col;
    }
}
