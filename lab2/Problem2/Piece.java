package lab2.Problem2;

public abstract class Piece {

    Position currentPosition;

    public Piece(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public abstract boolean isLegalMove(Position targetPosition);
}
