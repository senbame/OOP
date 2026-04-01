package lab2.Problem2;

public class Knight extends Piece {

    public Knight(Position currentPosition){
        super(currentPosition);
    }

    @Override
    public boolean isLegalMove(Position targetPosition){

        int rowDiff = Math.abs(currentPosition.row - targetPosition.row);
        int colDiff = Math.abs(currentPosition.col - targetPosition.col);

        return (rowDiff == 2 && colDiff == 1) ||
               (rowDiff == 1 && colDiff == 2);
    }
}
