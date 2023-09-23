import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private int targetNumber;
    private Player p1;
    private Player p2;
    private Player p3;

    public GuessingGame() {
        // Generate a random target number between 0 and 9
        Random random = new Random();
        targetNumber = random.nextInt(10);
        System.out.println("I'm thinking of a number between 0 and 9...");
    }

    public void startGame() {
        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        p3 = new Player("Player 3");

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Player 1, enter your guess: ");
        p1.guess(scanner.nextInt());
        System.out.print("Player 2, enter your guess: ");
        p2.guess(scanner.nextInt());
        System.out.print("Player 3, enter your guess: ");
        p3.guess(scanner.nextInt());

        if (p1.getNumber() == targetNumber) {
            p1IsRight = true;
        }
        if (p2.getNumber() == targetNumber) {
            p2IsRight = true;
        }
        if (p3.getNumber() == targetNumber) {
            p3IsRight = true;
        }

        System.out.println("The correct number was: " + targetNumber);
        System.out.println("Player 1 guessed correctly? " + p1IsRight);
        System.out.println("Player 2 guessed correctly? " + p2IsRight);
        System.out.println("Player 3 guessed correctly? " + p3IsRight);

        if (p1IsRight || p2IsRight || p3IsRight) {
            System.out.println("We have a winner(s)!");
            if (p1IsRight) {
                System.out.println("Player 1 is the winner!");
            }
            if (p2IsRight) {
                System.out.println("Player 2 is the winner!");
            }
            if (p3IsRight) {
                System.out.println("Player 3 is the winner!");
            }
        } else {
            System.out.println("None of the players guessed correctly. It's a tie!");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.startGame();
    }
}

class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public void guess(int guessedNumber) {
        number = guessedNumber;
        System.out.println(name + " guessed " + number);
    }

    public int getNumber() {
        return number;
    }
}
