import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Rock, Paper, and Scissors Game");

            System.out.print("Do you want to play? (yes/no) ");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("Ok, bye! :) ");
                break;
            } else {
                System.out.println("Awesome! Let's play now.");

                String[] options = { "rock", "paper", "scissors" };

                // Get user's choice
                System.out.print("Enter your choice (rock/paper/scissors): ");
                String userChoice = scanner.nextLine().toLowerCase();

                // Generate computer's choice
                int computerIndex = random.nextInt(3);
                String computerChoice = options[computerIndex];

                System.out.println("Computer's choice: " + computerChoice);

                // Determine the winner
                if (userChoice.equals(computerChoice)) {
                    System.out.println("It's!");
                } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
