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
}