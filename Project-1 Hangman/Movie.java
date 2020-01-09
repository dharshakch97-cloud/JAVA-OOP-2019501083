class Movie {

    String movie_name;
    String level;
    String hint1;
    String hint2;

    Movie() {

    }

    Movie(String mn, String l, String h1, String h2) {
        this.movie_name = mn;
        this.level = l;
        this.hint1 = h1;
        this.hint2 = h2;
    }

    public String toString() {
        return "Movie name: " + movie_name +
            "\n Level: " + level +
            "\n Hint 1 " + hint1 +
            "\n Hint 2 " + hint2;
    }
    
    public String getMovieName() {
        return this.movie_name;
    }

    public void setMovieName(String moviename) {
        this.movie_name = moviename;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getH1() {
        return this.hint1;
    }

    public void setH1(String h1) {
        this.hint1 = h1;
    }

    public String getH2() {
        return this.hint2;
    }

    public void setH2(String h2) {
        this.hint2 = h2;
    }
}
