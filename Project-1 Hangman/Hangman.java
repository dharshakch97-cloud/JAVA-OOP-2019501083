import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Hangman {
    public static void main(String[] args) {
        MovieList ml = new MovieList();

        File file = new File("movies.txt");
        Scanner scan = new Scanner(file);
            
        while(scan.hasNext()) {
            Movie movie = new Movie(scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine());
            ml.add(movie);
        }
        // ml.printMovies();
    }
}