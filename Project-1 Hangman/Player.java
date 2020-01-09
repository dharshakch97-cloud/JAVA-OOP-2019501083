class Player {
    String Pname;
    int score;

    Player() {
    }

    Player(String p, int s) {
        this.player1 = p;
        this.score = s;
    }

    public String toString() {
        return "Player name: " + this.player1 + 
                "\n Player score: " + this.score;
    }

    public String getPlayerName() {
        return this.player1;
    }

    public void setPlayerName(String p) {
        this.player1 = p;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int s) {
        this.score = s;
    }
}