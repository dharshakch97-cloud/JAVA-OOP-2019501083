class Show {
    String movie_name;
    String datetime;
    String[] seats;

    Show(String moviename, String datetime,String[] seats) {
        this.movie_name = moviename;
        this.datetime = datetime;
        this.seats = seats;
    }

    public String getMovieName() {
        return this.movie_name;
    }

    public String getDateTime() {
        return this.datetime;
    }

    public String[] getSeats() {
        return this.seats;
    }

    public void printTickets(Patron p) {
        System.out.println("Movie name: " + movie_name + 
                    " \n Date: " + datetime +
                    " \n Seat numbers: " + seats);
        System.out.println(p);
    }
    
}