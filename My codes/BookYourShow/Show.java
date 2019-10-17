public class Show {
    private String movie;
    private String date;
    private int seats;
    private String[] snum;
    public Show() {
      final int size = 3;
      snum = new String[size];
    }
    public Show (String movie, String date,int seats, String[] snum) {
      this.movie = movie;
      this.date = date;
      this.seats = seats;
      this.snum = snum;
    }
    public String getMovie() {
      return this.movie;
    }
    public int getSeats() {
      return this.seats;
    }
    public String[] getSnum() {
     return this.snum; 
    }
    public String getDate() {
      return this.date; 
     }
    public String toString() {
      String s;
      s = "-------------------" + "\n";
      s = s + "Name->" + movie + "\n";
      s = s + "Date->" + date + "\n";
      s = s + "Seats available->" + seats + "\n";
      s = s + "Seat numbers->" + snum[0] + " " +
          snum[1] + " " +
          snum[2] + " " +
          snum[3] + " " +
          snum[4];
      return s;
    }
    public void printShows() {
      System.out.println("movie" + movie);
      System.out.println("date" + date);
      System.out.println("seats" + seats);
      System.out.println("snum" + snum);
    }
    public int totalSeats(int seats) {
      this.seats = this.seats - seats;
      return this.seats;
    }
  }