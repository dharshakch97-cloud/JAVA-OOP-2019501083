import java.io.BufferedInputStream;
import java.util.Scanner;

public class BYS {

    private String[] byshow;
    private int size;

    public BYS() {
        byshow = new String[100];
        size = 0;
    }

    public void addmovie(String addmovie) {
        byshow[size] = addmovie;
        size++;
    }

    public void addbooking(String addmovie, String moviename2, String bookshowtime, String userseats) {
            int bookingcount = 0;
            String[] seats = userseats.substring(1,
                userseats.length() - 1).split(",");
            for (int i = 0; i < size; i++) {
                if (byshow[i].contains(moviename2)
                 && byshow[i].contains(bookshowtime)) {
                    byshow[size] = addmovie;
                    size++;
                    bookingcount++;
                    for (int j = 0; j < seats.length; j++) {
                        int index = byshow[i].indexOf(seats[j]);

                    byshow[i] = byshow[i].replace(seats[j] + ",", "N/A,");
                    byshow[i] = byshow[i].replace(seats[j] + "]", "N/A]");

                    }
                    break;
                }
            }
            if (bookingcount == 0) {
                System.out.println("No show");
            }
        }

    public String getmovie(String moviename, String showtime) {
        for (int i = 0; i < size; i++) {
            if (byshow[i].contains(moviename)
             && byshow[i].contains(showtime)) {
                return moviename + "," + showtime;
            }
        }
        return "No show";
    }

    public void showAll() {

        for (int k = 0; k < size; k++) {
            if (byshow[k].contains(",[")) {
                System.out.println(byshow[k]);
            }
       }
    }

    public String printbooking(String moviename, String showbooked, String usercontact) {
        for (int i = 0; i < size; i++) {
            if ((byshow[i].contains(moviename)
             && byshow[i].contains(usercontact))
              && byshow[i].contains(showbooked)) {
                return usercontact + " " + moviename + " " + showbooked;
            }
        }
        return "Invalid";
    }

    public static void main(String[] args) {
        final int a = 3, b = 4, c = 6, d = 24;
        BYS addmovieobj = new BYS();
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        while (input.hasNext()) {
            String readinput = input.nextLine();
            String[] bysinput = readinput.split(",");
            String[] bysmovie = bysinput[0].split(" ");
            String[] bysinput2 = readinput.split(" ");

            switch (bysmovie[0]) {
            case "add":
                String moviename = bysmovie[1];
                String bysseats = bysinput2[b].substring(c);
                String movie;
                movie = moviename + "," + bysinput[1] + "," + bysseats;
                addmovieobj.addmovie(movie);
                break;

            case "book":
                String userbooking;
                String moviename2 = bysmovie[1];
                String bookshowtime = bysinput[1];
                String username = bysinput[2];
                String bookusercontact = bysinput[a];
                String userseats = bysinput2[b].substring(d);
                userbooking = moviename2 + "-" + bookshowtime
                 + "-" + username + "-" + bookusercontact + "-" + userseats;
                addmovieobj.addbooking(userbooking, moviename2, bookshowtime, userseats);
                break;

            case "get":
                String moviename3 = bysmovie[1];
                String showtime = bysinput[1];
                System.out.println(
                addmovieobj.getmovie(moviename3, showtime));
                break;

            case "print":
                String moviename4 = bysmovie[1];
                String showbooked = bysinput[1];
                String usercontact = bysinput[2];
                System.out.println(addmovieobj.printbooking(moviename4,
                 showbooked, usercontact));
                break;

            case "showAll":
                addmovieobj.showAll();
                break;

            default:
                break;
            }
        }
        input.close();
    }

}