public class Yahtzee {
    public static int roll() {
        double randomNumber = Math.random();
        randomNumber = (randomNumber * 6) + 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }

    public static int keepRoll() {
        int c = 1;
        int dice1 = roll();
        int dice2 = roll();
        int dice3 = roll();
        int dice4 = roll();
        int dice5 = roll();

        while(!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
            dice1 = roll();
            dice2 = roll();
            dice3 = roll();
            dice4 = roll();
            dice5 = roll();
            c += 1;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(keepRoll());
    }
}