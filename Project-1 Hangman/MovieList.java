class MovieList {

    Movie[] movieList;
    Movie[] easyMovies;
    Movie[] mediumMovies;
    Movie[] hardMovies;
    int size;

    MovieList() {
        this.movieList = new Movie[30];
        this.size = 0;
    }

    public void add(Movie m) {
        movieList[size] = m;
        size++;
    }

    public void printMovies() {
        for (int i = 0; i < movieList.length; i++) {
            if (movieList[i] != null) {
                System.out.println(movieList[i].toString());
            }
        }
    }

    public void addEasyMovies(Movie[] movieList) {
        int noOfMovies = 0;
        for (int i = 0; i < movieList.length; i++) {
            if (movieList[i] != null && movieList[i].getLevel().equals("easy")) {
                easyMovies[noOfMovies++] = movieList[i];
            }
        }
    }

    public void addHardMovies(Movie[] movieList) {
        int noOfMovies = 0;
        for (int i = 0; i < movieList.length; i++) {
            if (movieList[i] != null && movieList[i].getLevel().equals("hard")) {
                hardMovies[noOfMovies++] = movieList[i];
            }
        }
    }

    public void addMediumMovies(Movie[] movieList) {
        int noOfMovies = 0;
        for (int i = 0; i < movieList.length; i++) {
            if (movieList[i] != null && movieList[i].getLevel().equals("medium")) {
                mediumMovies[noOfMovies++] = movieList[i];
            }
        }
    }
    

    public Movie[] getMovies(String level) {
        if (easyMovies != null && level.equals("easy")) {
            return easyMovies;
        }

        if (mediumMovies != null && level.equals("medium")) {
            return mediumMovies;
        }

        if (hardMovies != null && level.equals("hard")) {
            return hardMovies;
        }
        return movieList;
    }
}
