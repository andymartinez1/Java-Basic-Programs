import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = { "rock", "paper", "scissors" };
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("Please enter your move (rock, paper or scissors)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
                    break;
                }

                System.out.println(playerMove + " is an invalid move.");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie");
            } else if (playerMove.equals("rock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You lose.");
                } else if (computerMove.equals("scissors")) {
                    System.out.println("You wim!");
                }

            } else if (playerMove.equals("paper")) {
                if (computerMove.equals("rock")) {
                    System.out.println("You win!");
                } else if (computerMove.equals("scissors")) {
                    System.out.println("You lose");
                }

            } else if (playerMove.equals("scissors")) {
                if (computerMove.equals("rock")) {
                    System.out.println("You lose.");
                } else if (computerMove.equals("paper")) {
                    System.out.println("You win!");
                }
            }

            System.out.println("Play again? (yes/no)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        scanner.close();
    }
}
