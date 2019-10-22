class BookYourShow {
    Show[] shows;
    int showsCount;

    BookYourShow() {
        this.shows = new Show[10];
        this.showsCount = 0;
    }

    public void addAShow(Show show) {
        shows[showsCount] = show;
        showsCount++;
    }

    public Show getAShow(String moviename, String dtime) {
        for (int i = 0; i < showsCount; i++) {
            if (shows[i].getMovieName().equals(moviename) && shows[i].getDateTime().equals(dtime)) {
                return shows[i];
            }
        }
        return null;
    }

    public void removeAShow(String moviename) {
        for (int i = 0; i < showsCount; i++) {
            if (shows[i].getMovieName().equals(moviename)) {
                for (int j = i + 1; j < showsCount; j++) {
                    shows[i] = shows[j];
                    i++;
                }
                shows[showsCount] = null;
                showsCount--;
                System.out.println("Show removed.");
            }
        }
    }

    public void displayShows() {
        for (int i = 0; i < showsCount; i++) {
            System.out.println(shows[i]);
        }
    }
}