import java.util.Scanner;
import java.util.Random;

public class ropasc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String[] picks = { "rock", "paper", "scissor" };
    String playerChoice, computerChoice;
    String playAgain = "yes";
    int input = 0;

    do {

      System.out.println("Welcome to JAVA ROCK/PAPER/SCISSOR GAME!");

      System.out.print("Enter your pick (rock, paper, scissor): ");
      playerChoice = scanner.nextLine().toLowerCase();
      computerChoice = picks[random.nextInt(3)];

      for (String pick : picks) {
        if (!playerChoice.equals(pick)) {
          input++;
          if (input == 3) {
            System.out.println("Invalid pick!");
            input = 0;
          }
        }
      }

      if (input != 0) {

        input = 0;

        System.out.printf("Your pick: %s\n", playerChoice);
        System.out.printf("Computer's pick: %s\n", computerChoice);

        if (playerChoice.equals(computerChoice)) {
          System.out.println("It's a TIE!");
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissor")) ||
            (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
            (playerChoice.equals("scissor") && computerChoice.equals("paper"))) {
          System.out.println("You WIN!");
        } else {
          System.out.println("You LOSE!");
        }

        System.out.print("Do you want to play again? (yes/no): ");
        playAgain = scanner.nextLine();
      }

    } while (playAgain.equals("yes"));

    System.out.println("Thanks for playing!");

    scanner.close();
  }
}
