import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
    int size = 3;
    int ch1 = 1;
    String[] seatNumbers1 = {"A-10" ,"A-11", "A-12", "A-13", "A-14"};
    Show s1 = new Show("Mission Imposible", "Jan-2-2015", 5, seatNumbers1);
    String[] seatNumbers2 = {"B-10" ,"B-11", "B-12", "B-13", "B-14"};
    Show s2 = new Show("Harry Potter", "Jan-5-2015", 5, seatNumbers2);
    String[] seatNumbers3 = {"C-10" ,"C-11", "C-12", "C-13", "C-14"};
    Show s3 = new Show("Pixels", "Jan-8-2015", 5, seatNumbers3);
    BookYourShow show = new BookYourShow();
    System.out.println("****Available shows********");
    show.addAShow(s1);
    show.addAShow(s2);
    show.addAShow(s3);
    show.printShows();
    System.out.println("*****Get show details*******");
    System.out.println("Enter the movie name");
    Scanner input = new Scanner(System.in);
    String movie = input.nextLine();
    show.getAShow(movie);
    Patron p1 = new Patron("Dharshak", 70363);
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    System.out.println("********Book a show**********");
    System.out.println("Enter the movie name");
    Scanner input1 = new Scanner(System.in);
    String bookMovie = input1.nextLine();
    System.out.println("Enter the seats");
    Scanner input2 = new Scanner(System.in);
    int seats = input2.nextInt();
    int result = show.bookAShow(bookMovie, seats);
    if (result == 0) {
      System.out.println("show not found");
    }
    else {
    System.out.println("Customer->" + p1.getName());
    System.out.println("Mobile number->" + p1.getMobileNum());
    System.out.println("Date of booking->" + dateFormat.format(date));
    System.out.println("********Available shows*********");
    }
    show.getAShow(bookMovie);
    System.out.println("Remove a show");
    System.out.println("Enter the movie name");
    Scanner input3 = new Scanner(System.in);
    String rmovie = input3.nextLine();
    show.removeAMovie(rmovie);
    System.out.println("********Available shows*********");
    show.printShows();
  }
}