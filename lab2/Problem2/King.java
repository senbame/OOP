package lab2.Problem2;

public class King extends Piece {

    public King(Position currentPosition) {
        super(currentPosition);
    }

    @Override
    public boolean isLegalMove(Position targetPosition) {

        int rowDiff = Math.abs(currentPosition.row - targetPosition.row);
        int colDiff = Math.abs(currentPosition.col - targetPosition.col);

        return rowDiff <= 1 && colDiff <= 1;
    }
}
