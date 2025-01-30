import java.util.Scanner;

public class search {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] foods = { "Egg", "Milk", "Burger", "Pizza", "Cheese" };
    String target;
    boolean isFound = false;

    System.out.print("Enter food to search: ");
    target = scanner.nextLine();

    int index = 0;
    for (String food : foods) {
      if (target.equalsIgnoreCase(food)) {
        System.out.printf("%s is available at index %d\n", food, index);
        isFound = true;
      }
      index++;
    }

    if (!isFound) {
      System.out.printf("%s is not available.", target);
    }

    scanner.close();
  }
}
