class Rock extends Piece {
    int row;
    int column;
    Rock(int i,int j) {
        this.row = i;
        this.column = j;
    }

    boolean isValidMove(Position newPosition) {
        if (super.isValidMove(newPosition.row, newPosition.column)) {
            if(newPosition.column == this.column || newPosition.row == this.row) {
                return true;
            } 
            else {
                System.out.println("Rock can move horizantally or vertically. ");
                return false;
            }
        } else {
            System.out.println("Sorry!, it's out of the board.");
            return false;
        }
    }
    void changePosition(Position p) {
        this.row = p.row;
        this.column = p.column;
    }

    public String getPosition() {
        return "(" + this.row + "," + this.column + ")";
    }
}

class Queen extends Piece {
    int row;
    int column;
    Queen(int r, int c) {
        this.row = r;
        this.column = c;
    }

    boolean isValidMove(Position p) {
        if (super.isValidMove(p.row, p.column)) {
            if (p.row == this.row || p.column == this.column) { // straight
                return true;
            }

            if (Math.abs(p.row - this.row) == (p.column - this.column)) { //  Diagonol 
                return true;
            }

            System.out.println("Warning!, Queen can't be moved to this position. ");
            return false;
        } else {
            System.out.println("Is running out of the board.");
            return false;
        }
    }

    void changePosition(Position p) {
        this.row = p.row;
        this.column = p.column;
    }

    public String getPosition() {
        return "(" + this.row + "," + this.column + ")";
    }
}