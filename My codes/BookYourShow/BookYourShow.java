import java.util.ArrayList;
import java.util.ListIterator;
public class BookYourShow {
  ArrayList<Show> shows;
  ArrayList<Patron> pat;
  int totalShow;
  public BookYourShow() {
    shows = new ArrayList<Show>();
    pat = new ArrayList<Patron>();
    totalShow = 3;
  }
  public void addAShow(Show s) {
    shows.add(s);
  }
  public void getAShow(String movie) {
    ListIterator<Show> iterator = shows.listIterator();
    int flag = 0;
    while (iterator.hasNext()) {
      Show s = iterator.next();
      if(movie.compareTo(s.getMovie()) == 0) {
      System.out.println(s);
      flag = 1;
      }
   }
      if (flag == 0) {
        System.out.println("show not found");
      }
  }
  public int bookAShow(String bookMovie, int noOfSeats) {
    ListIterator<Show> iterator = shows.listIterator();
    ListIterator<Patron> iterator1 = pat.listIterator();
    int flag = 0;
    int size = 5;
    while (iterator.hasNext()) {
      Show s = iterator.next();
      if(bookMovie.compareTo(s.getMovie()) == 0) {
        if(noOfSeats <= s.getSeats()) {
          int remSeats = s.totalSeats(noOfSeats);
          System.out.println("******Booking details*******");
          System.out.println("Name->" + s.getMovie());
          System.out.println("Date->" + s.getDate());
          System.out.println("Seats->" + noOfSeats);
          System.out.println("Seat numbers->");
          for(int i = 0; i < noOfSeats; i++ ) {
            String[] snum = s.getSnum();
            System.out.println(snum[i]);
          }
          for(int i = 0; i < noOfSeats; i++ ) {
            for(int j = i; j< i - 1; j++) {
            String[] snum = s.getSnum();
            snum[j] = snum[j + 1];
            }
            noOfSeats--;
          }
          flag = 1;
        }
        else {
          System.out.println("not sufficient seats");
        }
      }
   }
      if (flag == 0) {
        return 0;
      }
      else {
        return 1;
      }
}
     
  
  public void removeAMovie(String movie) {
    ListIterator<Show> iterator = shows.listIterator();
    int flag = 0;
    while (iterator.hasNext()) {
      Show s = iterator.next();
      if(movie.compareTo(s.getMovie()) == 0) {
          shows.remove(s);
      flag = 1;
      }
   }
      if (flag == 0) {
        System.out.println("show not found");
      }
}

  public void printShows() {
    ListIterator<Show> iterator = shows.listIterator();
    while (iterator.hasNext()) {
      Show s = iterator.next();
      System.out.println(s);
  }
 }
}