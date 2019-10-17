class BookYourShow {
    Show[] shows;
    int showsCount;
    Patron[] bookedShows;
    int bookedCount;

    BookYourShow(Show[] s, Patron[] bs, int sc, int bc) {
        shows = new Show[10];
        bookedShows = new Patron[10];
        showsCount = 0;
        bookedCount = 0;
    }

    public void addShow(Show show) {
        shows[showsCount] = show;
        showsCount++;
    }

    public Show getAShow(String moviename, String dtime) {
        for (int i = 0; i < showsCount; i++) {
            if (shows[i].movie_name == moviename && shows[i].datetime == dtime) {
                return shows[i];
            }
        }
    }

    public void BookAShow(String moviename, String dtime, Patron p, String[] seats) {
        Show searchShow = getAShow(moviename, dtime);
        if (searchShow == null) {
            System.out.println("No show available.")
        }
        else {
            // int c = 0;
            // for (int i = 0; i < showsCount; i++) {
            //     for (String t : seats) {

            //     }
            // }
        }
    }

    public void printTickets(String moviename, String dtime, String mobilenumber) {
        Show searchShow = getAShow(moviename, dtime);
        if (searchShow == null) {
            System.out.println("No show available.");
        }
        else {
            for (int i = 0; i < bookedCount; i++) {
                if (bookedShows[i].Pnumber.equals(mobilenumber)) {
                    System.out.println("Movie name : " + moviename +
                                    " \n ShowTime : " + dtime +
                                    " \n mobile number : " + mobilenumber);
                    break;
                }
                else {
                    System.out.println("No tickets booked.");
                }
            }
        }
    }
}