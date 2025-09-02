import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!\n" +
                "I'm thinking of a number between 1 and 100.\n");

        System.out.println("Please select the difficulty level:\n" +
                "1. Easy (10chances)\n" +
                "2. Medium (5chances)\n" +
                "3. Hard (3chances)\n");

        System.out.println("Enter your choice: ");
        switch (sc.nextLine()) {
            case "1":
                System.out.println("You have selected the easy level: \n" +
                    "Let's start the game!");
                int random = (int) (Math.random() * 100);
                System.out.println("enter your guess: ");
                for (int i = 0; i < 10; i++) {
                    int guess = Integer.parseInt(sc.nextLine());
if(guess > random) {
    System.out.println("Incorrect! The number is less then " + guess);
                    } else if(guess < random) {
                        System.out.println("Incorrect! The number is greater then " + guess + " !");
                    }
                    if(guess == random) {
                        System.out.println("Congratulations! You have won the game!");
                        int attempts = i+1;
                        System.out.println("You guessed the correct number in " + attempts + " attempts.");
                    }
                }
                break;

            case "2":
                System.out.println("You have selected the medium level: \n" +
                        "Let's start the game!");
                random = (int) (Math.random() * 100);
                System.out.println("enter your guess: ");
                for (int i = 0; i < 5; i++) {
                    int guess = Integer.parseInt(sc.nextLine());
                    if(guess > random) {
                        System.out.println("Incorrect! The number is less then " + guess + " !");
                    } else if(guess < random) {
                        System.out.println("Incorrect! The number is greater then " + guess + " !");
                    } else if(guess == random) {
                        System.out.println("Congratulations! You have won the game!");
                        int attempts = i+1;
                        System.out.println("You guessed the correct number in " + attempts + " attempts.");
                    }
                }
                break;

            case "3":
                System.out.println("You have selected the hard level: \n" +
                        "Let's start the game!");
                random = (int) (Math.random() * 100);
                System.out.println("enter your guess: ");
                for (int i = 0; i < 3; i++) {
                    int guess = Integer.parseInt(sc.nextLine());
                    if(guess > random) {
                        System.out.println("Incorrect! The number is less then " + guess + " !");
                    } else if(guess < random) {
                        System.out.println("Incorrect! The number is greater then " + guess + " !");
                    } else if(guess == random) {
                        System.out.println("Congratulations! You have won the game!");
                        int attempts = i+1;
                        System.out.println("You guessed the correct number in " + attempts + " attempts.");
                    }
                }
                break;
        }
        System.out.println("See you later!");
        sc.close();
    }
}