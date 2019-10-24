class Movie {

    private String movie_name;
    private String level;
    private String hint1;
    private String hint2;

    Movie() {

    }

    Movie(String mn, String l, String h1, String h2) {
        this.movie_name = mn;
        this.level = l;
        this.hint1 = h1;
        this.hint2 = h2;
    }

    public String toString() {
        return "Movie name: " + this.movie_name +
            "\n Level: " + this.level +
            "\n Hint 1 " + this.hint1 +
            "\n Hint 2 " + this.hint2;
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

    public String getHint1() {
        return this.hint1;
    }

    public void setHint1(String h1) {
        this.hint1 = h1;
    }

    public String getHint2() {
        return this.hint2;
    }

    public void setHint2(String h2) {
        this.hint2 = h2;
    }
}
