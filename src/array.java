import java.util.Arrays;
import java.util.Scanner;

public class array {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n;
    String[] fruits;

    System.out.print("Enter no. of fruits to store: ");
    n = scanner.nextInt();
    scanner.nextLine();

    fruits = new String[n];

    for (int c = 0; c < fruits.length; c++) {
      System.out.print("Enter fruit name: ");
      fruits[c] = scanner.nextLine();
      System.out.println("Added!");
    }

    Arrays.sort(fruits);

    System.out.println("----------");
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    scanner.close();

  }
}
