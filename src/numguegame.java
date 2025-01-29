import java.util.Scanner;
import java.util.Random;

public class numguegame {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String response = "";
    int randomNum, inputNum;
    int min = 50;
    int max = 100;

    System.out.println("Number Guessing Game");
    System.out.println("Guess a number between 50-100");

    do {
      randomNum = random.nextInt(min, max + 1);
      int attempts = 0;
      boolean status = false;

      while (!status) {

        System.out.print("Enter a number: ");

        while (!scanner.hasNextInt()) {
          System.out.println("Not a number");
          scanner.nextLine();
          System.out.print("Enter a number: ");
        }

        inputNum = scanner.nextInt();

        if (inputNum < 50 || inputNum > 100) {
          System.out.println("Number must be between 50-100!");
        } else if (inputNum < randomNum) {
          System.out.println("Number is too LOW!");
        } else if (inputNum > randomNum) {
          System.out.println("Number is too HIGH!");
        } else {
          status = true;
          System.out.printf("Nice🎉! It took you %d attempts.", attempts + 1);
        }

        attempts++;
      }

      scanner.nextLine();

      System.out.print("\nDo you want to play again? (yes or no): ");
      response = scanner.nextLine();

    } while (response.equalsIgnoreCase("yes"));

    scanner.close();
  }

}
