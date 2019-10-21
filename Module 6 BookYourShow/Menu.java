/**
 * This menu class creates objects for BookYourShow and Show objects
 * and adds the shows objects to the BookYourShow Object. Then the 
 * Patrons can book the tickets based on the shows available.
 * 
 * This is a sample and skeleton code that gives you an idea of how
 * to create objects for different classes.
 * 
 * You can have your own test cases and test your Show, Patron and 
 * BookYourShow classes.
 * 
 * @author Praveen Garimella
 * @author Siva Sankar
 * 
 */

public class Menu {
  public static void main(String[] args) {
    int checkTickets;
    //  Creating an object for BookYourShow application.
    BookYourShow book = new BookYourShow();

    String movieName = "Mission Impossible";
    String datetime = "Aug 18, 2015 17:30";
    String[] seats = {"A1","A2","A3","B1","B2","B3","C1","C2"};
    
    //  Creating an object for Show with the movieName, datetime and
    //  the number of seats and adding the show to the BookYourShow
    //  Object.
    Show show = new Show(movieName, datetime, seats);
    book.addAShow(show);
    //System.out.println(show);

    //  Creating an object for Show with the movieName, datetime and
    //  the number of seats of seats and adding the show to the BookYourShow
    //  Object.
    movieName = "Mission Impossible";
    datetime = "Aug 18, 2015 10:30";
    show = new Show(movieName, datetime, seats);
    book.addAShow(show);

    //  Creating an object for Show with the movieName, datetime and
    //  the number of seats of seats and adding the show to the BookYourShow
    //  Object.
    movieName = "Inside Out";
    datetime = "Aug 18, 2015 15:30";
    show = new Show(movieName, datetime, seats);
    book.addAShow(show);

    //  Searching for a show at a specific date and time.
    Show result = book.getAShow("Mission Impossible", "Aug 18, 2015 17:30");
    if(result == null)
      System.out.println("No shows available!");
    else
      System.out.println(result);

    //  Now the Patron's are trying to book the tickets for which the
    //  show is available based on the previous step.
    Patron p1 = new Patron("Dharshak", "9087654321");
    String[] s1 = {"B1", "B2"};
    result.bookAShow(p1, s1); // print the tickets for patron1
    result.printTickets(p1);
    System.out.println();

    System.out.println(result);
    Patron p2 = new Patron("Sam", "8907654321");
    String[] s2 = {"A1", "A2", "A3"};
    result.bookAShow(p2, s2); // print the tickets for patron2
    result.printTickets(p2);
    System.out.println();

    System.out.println(result);
    Patron p3 = new Patron("Satya", "7809654321");
    String[] s3 = {"A1", "A2", "A3"};
    result.bookAShow(p3, s3); // print the tickets for patron3
    result.printTickets(p3);
  }
}