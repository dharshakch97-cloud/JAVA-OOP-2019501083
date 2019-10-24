class Player {
    private String player1;
    private String level;
    private int score;

    Player() {

    }

    Player(String p) {
        this.player1 = p;
        this.score = 0;
        this.level = "";
    }

    public String toString() {
        return "Player name: " + this.player1 + 
                "\n Player level: " + this.level +
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

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String l) {
        this.level = l;
    }
}