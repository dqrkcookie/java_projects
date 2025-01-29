import java.util.Scanner;
import java.util.InputMismatchException;

public class calculator {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double result = 0;
    char operator;
    String userResponse = "";

    do {
      boolean validOperator = true;
      double num1 = getValidInput(scanner, "Enter num1: ");

      System.out.print("Enter operator (+, -, *, /, ^): ");
      operator = scanner.next().charAt(0);

      double num2 = getValidInput(scanner, "Enter num2: ");

      switch (operator) {
        case '+' -> result = add(num1, num2);
        case '-' -> result = sub(num1, num2);
        case '*' -> result = mul(num1, num2);
        case '/' -> {
          if (num2 == 0) {
            System.out.println("Cannot divide by ZERO!");
            validOperator = false;
          } else {
            result = div(num1, num2);
          }
        }
        case '^' -> result = pow(num1, num2);
        default -> {
          System.out.println("Invalid Operator!");
          validOperator = false;
        }
      }

      if (validOperator) {
        System.out.printf("Result: %,.2f\n", result);
      }

      scanner.nextLine();
      System.out.print("Try again (yes or no): ");
      userResponse = scanner.nextLine();
    } while (userResponse.equalsIgnoreCase("yes"));

    scanner.close();
  }

  public static double getValidInput(Scanner scanner, String prompt) {
    while (true) {
      try {
        System.out.print(prompt);
        return scanner.nextDouble();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input!");
        scanner.nextLine();
      }
    }
  }

  public static double add(double x, double y) {
    return x + y;
  }

  public static double sub(double x, double y) {
    return x - y;
  }

  public static double mul(double x, double y) {
    return x * y;
  }

  public static double div(double x, double y) {
    return x / y;
  }

  public static double pow(double x, double y) {
    return Math.pow(x, y);
  }
}