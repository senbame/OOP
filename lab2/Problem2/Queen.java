package lab2.Problem2;

public class Queen extends Piece {

    public Queen(Position currentPosition) {
        super(currentPosition);
    }

    @Override
    public boolean isLegalMove(Position targetPosition) {

        boolean rookMove =
                currentPosition.row == targetPosition.row ||
                currentPosition.col == targetPosition.col;

        boolean bishopMove =
                Math.abs(currentPosition.row - targetPosition.row) ==
                Math.abs(currentPosition.col - targetPosition.col);

        return rookMove || bishopMove;
    }
}
