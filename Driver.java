package lab3;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        /**
         * Create an ArrayList<Piece> to include all types of pieces.
         */
        ArrayList<Piece> variousPieces = new ArrayList<Piece>();
        variousPieces.add(new Pawn(false));
        variousPieces.add(new Pawn(false, true, new Knight(true)));
        variousPieces.add(new Pawn(false, false, new Knight(true)));
        variousPieces.add(new Pawn(false, true, new King(true)));
        variousPieces.add(new Knight(true));
        variousPieces.add(new Bishop(false));
        variousPieces.add(new Rook(true));
        variousPieces.add(new Queen(false));
        variousPieces.add(new King(true));

        /**
         * Using for-each loop, call move() method on each Piece to print the moves.
         */
        for (int i = 0; i < variousPieces.size(); i++) {
            // for checking the contents
//            System.out.println(variousPieces.get(i).toString());
            variousPieces.get(i).move();
        }

        // for checking whether invalid inputs for Pawns are cancelled
//        Pawn pp1 = (Pawn) variousPieces.get(1);
//        Pawn pp2 = (Pawn) variousPieces.get(2);
//        Pawn pp3 = (Pawn) variousPieces.get(3);
//        System.out.println(pp1.newPiece);
//        System.out.println(pp2.newPiece);
//        System.out.println(pp3.newPiece);

        /**
         * Create the following Pawns,
         */
        Pawn p1 = new Pawn (true, true, new Queen(true));
        Pawn p2 = new Pawn (true, false, null);
        Pawn p3 = new Pawn (false, false, null);
        Pawn p4 = new Pawn (false, true, new Queen(true));
        Pawn p5 = new Pawn (true, true, new Knight(true));

        /**
         * Use equals() method to compare the following:
         */
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));

        // this returns true
//        p4.setWhite(true);
//        System.out.println(p1.equals(p4));

    }
}
