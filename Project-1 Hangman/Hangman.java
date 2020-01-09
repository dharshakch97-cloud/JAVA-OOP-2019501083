import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Hangman {

    public static boolean isWorGuessed(String randomMovie, List<Character> lettersGuessed) {
        int c = 0;
        for (int i = 0; i < randomMovie.length(); i++) {
            for (int j = 0; j < lettersGuessed.size(); j++) {
                if (randomMovie.charAt(i).equals(lettersGuessed.get(i))) {
                    c += 1;
                }
            }
        }
        if (c == randomMovie.length()) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String getGuessedWord(String randomMovie, List<Character> lettersGuessed) {
        List<Character> blankSpaces = new ArrayList<>();
        String guessedWord = "";

        for (int i = 0; i < randomMovie.length(); i++) {
            blankSpaces.add('_');
        }

        for (int i = 0; i < randomMovie.length(); i++) {
            if (lettersGuessed.contains(randomMovie.charAt(i))) {
                blankSpaces.set(i, randomMovie.charAt(i));
            }
        }

        for (int i = 0; i < blankSpaces.size(); i++) {
            word += " " + blankSpaces.get(i);
        }
    }

    public static List getAvailableLetters(List<Character> lettersGuessed) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        List<Character> availLetters = new ArrayList<>();
        for (int i = 0; i < alphabets.length(); i++) {
            availLetters.add(alphabets.charAt(i));
        }

        for (int i = 0; i < lettersGuessed.size(); i++) {
            availLetters.remove(lettersGuessed.get(i));
        }
        return availLetters;
    }

    public static void main(String[] args) {
        System.out.println("Enter the no. of players want to play: ");
        Scanner s = new Scanner(System.in);
        int noOfPlayers = s.nextLine();

        Hangman hangman = new Hangman();

        for (int i = 0; i < noOfPlayers; i++) {
            System.out.println("Enter user name: ");
            String player_name = s.nextLine();

            String filename = "movies.txt";
            MovieList ml = new MovieList();
            try {
                ml.loadfile(filename);
            }
            catch(Exception e) {

            }

            while (true) {

                System.out.println("\n" + "Select a level" +
                "\n 1 - easy" + "\n 2 - medium" + "\n 3 - hard" + "\n 4 - default");
                int userChoice = s.nextInt();
                if (userChoice >= 1 && userChoice <= 4 )  {
                    randomMovie = ml.randomPick(userChoice);
                    randomMovie = randMovie.toLowerCase();
                    if (doneMovie.contains(randomMovie)) {
                        System.out.println("Sorry don't mind! This movie already picked, So please choose the level again");
                        continue;
                    }
                   
                    doneMovie.add(randomMovie);
                    System.out.println("\n" + randomMovie);
                    break;
                } else {
                    System.out.println("\n" + "Choose a level ranging from 1 to 4" + "\n");
                    continue;  
                }
            }

            int length = randomMovie.length();
            
            System.out.println("Welcome To The Game, Hangman!");
            System.out.println("I Am Thinking Of A Word Which is " + length + " Letters Long");
            System.out.println("--------------");

            boolean wl = hangman.game(s, ml);
            if (wl) {
                score = 0;
                c = 0;
                System.out.println("you have lost the game");
                System.out.println(randomMovie);
            }
            players.add(new Player(player_name, score));
        }

        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }

        public boolean game(Scanner s,MovieFile ml) {
            List<Character> lettersGuessed = new ArrayList<>();
            int guesses = 8;
            while (guesses != 0) {
                System.out.println("\n");
                List availableLetters = getAvailableLetters(lettersGuessed);
                System.out.println("available letters" + availableLetters);
                System.out.println("\n");
                System.out.println("You Have " + guesses + " guesses Left" + "\n");
                
                if ( c <= 1) {
                    System.out.println("if u need hint choose 1 ");
                    try {
                    uNeedHint = jnu.nextInt();
                    } catch (Exception ex) {
                        ex = new Exception("s");
                    }
                }  
                if (uNeedHint == 1 && c <= 1) {
                    c += 1;
                }
                if (c == 1) {
                    obj.hint1(randMovie);
                }
                if (c == 2) {
                    obj.hint1(randMovie);
                    obj.hint2(randMovie);
                }

                System.out.println("enter a letter" + "\n");
                userGuess = jnu.next().charAt(0);
                userGuess = Character.toLowerCase(userGuess);

                
                if (lettersGuessed.contains(userGuess)) {
                    System.out.println("Oops! you have already guessed this letter:");
                    System.out.println("\n");
                    System.out.println("try another letter");
                    System.out.println("-----------------");
                    continue;
                }
                if (randMovie.contains(Character.toString(userGuess))) {
                    System.out.println("Good Guess");
                    System.out.println("\n");
                    lettersGuessed.add(userGuess);
                    word = getGuessedWord(randMovie, lettersGuessed);
                    System.out.println(word);
                    System.out.println("\n");
                    isfound = iswordguessed(randMovie, lettersGuessed);
                    if (isfound == true) {
                        c = 0;
                        score  = randMovie.length();
                        System.out.println(score);
                        System.out.println("you have guessed the correct word");
                        break;
                    }
                    System.out.println("try another letter");
                    System.out.println("---------------");
                    continue;
                }
                else {
                    System.out.println("Oops! That Letter Is Not In My Word:");
                    if (lettersGuessed.size() == 0 ) {
                        for (int i = 0; i < randMovie.length(); i++) {
                            System.out.print("_ ");
                        }
                    }
                    else if(lettersGuessed.size() > 0){
                        System.out.println(word);
                    }
                    else {
                        System.out.println(word);
                    }
                    guesses = guesses-1;
                    System.out.println("\n");
                    System.out.println("try another letter");
                    System.out.println("--------------");
                    lettersGuessed.add(userGuess);
                    continue;
                }
            }
            if(guesses==0){
                return true;
            }
            return false;
        }
    }
}