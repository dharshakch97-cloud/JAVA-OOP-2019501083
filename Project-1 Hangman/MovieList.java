import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.io.File;


class MovieList {

    List<Movie> movies = new ArrayList<>();
    List<Integer> easyMovies = new ArrayList<>();
    List<Integer> mediumMovies = new ArrayList<>();
    List<Integer> hardMovies = new ArrayList<>();
    List<Integer> defMovies = new ArrayList<>();

    public void loadFile(String file) throws Exception {
        File f = new File(file);
        Scanner scan = new Scanner(f);
        while (scan.hasNextLine()) {
            movies.add(new Movie(scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine()));
        }
        scan.close();

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getLevel().equals("Easy")) {
                easyMovies.add(i);
            }
        }

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getLevel().equals("Medium")) {
                mediumMovies.add(i);
            }
        }

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getLevel().equals("Hard")) {
                hardMovies.add(i);
            }
        }

        for (int i = 0; i < movies.size(); i++) {
                defMovies.add(i);
        }
    }

    public void getHint1(String pickedMovie) {
        for (int i = 0; i < movies.size(); i++) {
            if (pickedMovie.equalsIgnoreCase(movies.get(i).getMovieName())) {
                System.out.println(movies.get(i).getH1());
            }
        }
    }

    public void getHint2(String pickedMovie) {
        for (int i = 0; i < movies.size(); i++) {
            if (pickedMovie.equalsIgnoreCase(movies.get(i).getMovieName())) {
                System.out.println(movies.get(i).getH2());
            }
        }
    }

    public String randomChoose(int uChoice) {
        Random r = new Random();
        if (uChoice.equals(1)) {
            int rInt = r.nextInt(easyMovies.size());
            return movies.get(easyMovies.get(rInt)).getMovieName();
        }

        if (uChoice.equals(2)) {
            int rInt = r.nextInt(mediumMovies.size());
            return movies.get(mediumMovies.get(rInt)).getMovieName();
        }

        if (uChoice.equals(3)) {
            int rInt = r.nextInt(hardMovies.size());
            return movies.get(hardMovies.get(rInt)).getMovieName();
        }

        if (uChoice.equals(4)) {
            int rInt = r.nextInt(defMovies.size());
            return movies.get(defMovies.get(rInt)).getMovieName();
        }
    }
}
