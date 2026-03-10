package lab2.Problem2;

public abstract class Piece {

    protected Position currentPosition;

    public Piece(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public abstract boolean isLegalMove(Position targetPosition);
}
