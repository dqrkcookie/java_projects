import java.util.Scanner;
import java.util.Random;

public class dice {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int roll;
    int total = 0;

    System.out.print("Enter no. of dice to roll: ");
    roll = scanner.nextInt();

    if (roll > 0) {
      for (int c = 0; c < roll; c++) {
        int result = random.nextInt(1, 6 + 1);
        printDie(result);
        System.out.printf("You rolled: %d\n", result);
        total += result;
      }
    } else {
      System.out.print("Roll must be greated than Zero!");
    }

    System.out.printf("Total: %d", total);

    scanner.close();
  }

  static void printDie(int result) {
    String one = """
         -------
        |       |
        |   ●   |
        |       |
         -------
        """;
    String two = """
         -------
        | ●     |
        |       |
        |     ● |
         -------
        """;
    String three = """
         -------
        | ●     |
        |   ●   |
        |     ● |
         -------
        """;
    String four = """
         -------
        | ●   ● |
        |       |
        | ●   ● |
         -------
        """;
    String five = """
         -------
        | ●   ● |
        |   ●   |
        | ●   ● |
         -------
        """;
    String six = """
         -------
        | ●   ● |
        | ●   ● |
        | ●   ● |
         -------
        """;

    switch (result) {
      case 1 -> System.out.print(one);
      case 2 -> System.out.print(two);
      case 3 -> System.out.print(three);
      case 4 -> System.out.print(four);
      case 5 -> System.out.print(five);
      case 6 -> System.out.print(six);
      default -> System.out.println("Program error!");
    }

  }
}
