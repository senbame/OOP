package lab2.Problem2;

public class Main {

    public static void main(String[] args) {

        Position start = new Position(0, 0);
        Position target1 = new Position(0, 5);
        Position target2 = new Position(3, 3);

        Piece rook = new Rook(start);
        Piece bishop = new Bishop(start);
        Piece knight = new Knight(start);
        Piece queen = new Queen(start);
        Piece king = new King(start);
        Piece pawn = new Pawn(start);

        System.out.println("Rook move: " + rook.isLegalMove(target1));
        System.out.println("Bishop move: " + bishop.isLegalMove(target2));
        System.out.println("Knight move: " + knight.isLegalMove(target2));
        System.out.println("Queen move: " + queen.isLegalMove(target2));
        System.out.println("King move: " + king.isLegalMove(new Position(1, 1)));
        System.out.println("Pawn move: " + pawn.isLegalMove(new Position(1, 0)));
    }
}
