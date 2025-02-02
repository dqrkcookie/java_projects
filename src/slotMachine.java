import java.util.Scanner;
import java.util.Random;

public class slotMachine {
  public static void main(String[] args) throws InterruptedException {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int balance = 100;
    int bet, reward;
    String[] row = new String[3];
    String[] symbols = { "7", "*", "0", "$", "#" };
    String playAgain = "yes";

    do {
      while (balance > 0) {

        System.out.println("-----------------");
        System.out.println("Java Slot Machine");
        System.out.println("Symbols: 7 * 0 $ #");
        System.out.println("-----------------");

        System.out.print("Enter your bet: ");
        bet = scanner.nextInt();
        scanner.nextLine();

        if (bet > balance) {
          System.out.println("Not enough balance!");
          continue;
        } else if (bet < 0) {
          System.out.println("Bet can't be negative!");
          continue;
        } else {
          balance -= bet;
        }

        System.out.println("Rolling...");
        Thread.sleep(2000);
        printSlot(row, symbols, random);

        reward = reward(row, bet);

        if (reward > 0) {
          System.out.printf("You WON total of %d\n", reward);
          System.out.printf("Current balance: %d\n", balance += reward);
        } else {
          System.out.println("You Lost this time!");
          System.out.printf("Current balance: %d\n", balance);
        }

        System.out.print("Do you want to play again? (yes/no): ");
        playAgain = scanner.nextLine().toLowerCase();

        if (playAgain.equals("no")) {
          break;
        }

      }
    } while (playAgain.equals("yes") && balance > 0);

    if (balance == 0 && playAgain.equals("yes")) {
      System.out.println("Can't play another game!");
      System.out.println("Your balance is ZERO");
    } else {
      System.out.println("Thanks for playing!");
    }

    scanner.close();
  }

  static void printSlot(String[] row, String[] symbols, Random random) {
    for (int c = 0; c < row.length; c++) {
      row[c] = symbols[random.nextInt(5)];
    }

    System.out.println(String.join(" | ", row));

  }

  static int reward(String[] row, int bet) {

    if (row[0].equals(row[1]) && row[1].equals(row[2])) {
      return switch (row[0]) {
        case "7" -> bet * 100;
        case "*" -> bet * 50;
        case "0" -> bet * 10;
        case "$" -> bet * 60;
        case "#" -> bet * 20;
        default -> 0;
      };
    } else if (row[0].equals(row[1]) || row[1].equals(row[2])) {
      return switch (row[1]) {
        case "7" -> bet * 50;
        case "*" -> bet * 25;
        case "0" -> bet * 5;
        case "$" -> bet * 30;
        case "#" -> bet * 10;
        default -> 0;
      };
    } else {
      return 0;
    }
  }

}
