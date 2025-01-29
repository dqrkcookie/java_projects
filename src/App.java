import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("-------------------");
            System.out.println("| BANKING PROGRAM |");
            System.out.println("| 1. Show Balance |");
            System.out.println("| 2. Deposit      |");
            System.out.println("| 3. Withdraw     |");
            System.out.println("| 4. Exit         |");
            System.out.println("-------------------");

            System.out.print("Select your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += depositMoney(scanner);
                case 3 -> balance -= withdrawMoney(scanner, balance);
                case 4 -> isRunning = exitProgram(isRunning);
                default -> System.out.println("Invalid choice!");
            }

        }

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Balance: %,.2f\n", balance);
    }

    static double depositMoney(Scanner scanner) {
        double amount;

        System.out.println("-------------------------");
        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        } else {
            System.out.println("Deposit success!");
            return amount;
        }
    }

    static double withdrawMoney(Scanner scanner, double balance) {

        double amount;

        System.out.print("Enter amount to withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        } else {
            System.out.println("Withdraw success!");
            return amount;
        }

    }

    static boolean exitProgram(boolean status) {
        System.out.println("---------------");
        System.out.println("Program exited!");

        return status = false;
    }

}