class Chess {
    Piece [][] board;
    // Constructor creates an empty board
        Chess() {
            board = new Piece[8][8];
        }
    }

class Position {
    int row;
    int column;
        // Constructor using row and column values
    Position(int r, int c) {
        this.row = r;
        this.column = c;
    }

    public String getPosition() {
        return "(" + this.row + "," + this.column + ")";
    }
}

class Piece {
    Position position;
    boolean isValidMove(int row, int column) {
        if(row>=0 && column>=0
        && row<8 && column<8) {
            return true;
        } 
        else {
            return false;
        }
    }
}

// class Rock extends Piece {
//     // default constructor
//     public Rock() {
//         super(); // this will call the parent's constructor
//         this.name = "rock";
//     }
// }
    

final class Game {
    public static void main(String[] args) {
    
        // Rock r1 = new Rock(0, 0);
        // Rock r2 = new Rock(0, 7);

        // // Position rock2Pos = new Position(0,7);
        // // Rock r2 = new Rock(rock2Pos);

        // Position newPosForR1 = new Position(4,0);
        // Position newPosForR2 = new Position(0,10);
        // // for newPosR1

        // if (r1.isValidMove(newPosForR1)) {
        //     System.out.println("Valid! piece moving to " + newPosForR1.getPosition());
        //     r1.changePosition(newPosForR1);
        //     System.out.println("Updated position : " + r1.getPosition());
        // }
        // else {
        //     System.out.println("Can't move to this position!" + r1.getPosition());
        // }
        // System.out.println();
        // // for newPosR2

        // if (r1.isValidMove(newPosForR2)) {
        //     System.out.println("Valid! piece moving to " + newPosForR2.getPosition());
        //     r1.changePosition(newPosForR2);
        //     System.out.println("Updated position : " + r1.getPosition());
        // }
        // else {
        //     System.out.println("Can't move to this position!" + r1.getPosition());
        // }

        Queen queen = new Queen(0,4);

        Position newPosForQueen = new Position(2, 6);

        if (queen.isValidMove(newPosForQueen)) {
            System.out.println("Queen can be moved." + newPosForQueen.getPosition());
            queen.changePosition(newPosForQueen);
            System.out.println("Current position : " + queen.getPosition());
        }

    }
}
