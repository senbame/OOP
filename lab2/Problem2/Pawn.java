package lab2.Problem2;

public class Pawn extends Piece {

    private boolean firstMove = true;

    public Pawn(Position currentPosition){
        super(currentPosition);
    }

    @Override
    public boolean isLegalMove(Position targetPosition){

        int rowDiff = targetPosition.row - currentPosition.row;
        int colDiff = Math.abs(targetPosition.col - currentPosition.col);

        // ход вперёд на 1
        if(rowDiff == 1 && colDiff == 0)
            return true;

        // первый ход на 2
        if(firstMove && rowDiff == 2 && colDiff == 0)
            return true;

        // удар по диагонали
        if(rowDiff == 1 && colDiff == 1)
            return true;

        return false;
    }
}
