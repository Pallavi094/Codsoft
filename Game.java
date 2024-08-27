import java.util.Random;
import java.util.Scanner;

public class Game {

    public static int playGame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        
        int ran = random.nextInt((max - min) + 1) + min;
        int score = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter your guess: ");
            int a = sc.nextInt();
            
            if (a > ran) {
                System.out.println("Your number is High, Please Try Again");
            } else if (a < ran) {
                System.out.println("Your number is Low, Please Try Again");
            } else {
                System.out.println("You got the number: " + a);
                score++;
                break;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalScore = 0;
        int round = 0;

        while (true) {
            round++;
            totalScore += playGame();
            System.out.println("Do you want to play again? yes/no");
            String c = sc.next();

            if (c.equalsIgnoreCase("yes")) {
                continue;
            } else if (c.equalsIgnoreCase("no")) {
                System.out.println("Okay, goodbye!");
                System.out.println("Total Rounds Played: " + round);
                System.out.println("Your Total Score: " + totalScore);
                break;
            } else {
                System.out.println("Invalid input, please enter yes or no.");
                round--;  
            }
        }
        sc.close();
    }
}
