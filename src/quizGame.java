import java.util.Scanner;

public class quizGame {
  public static void main(String[] args) {

    String[] questions = {
        "Who is the Archon of Mondstadt?",
        "How many elements are there in Genshin Impact?",
        "What do you call the purple element?",
        "Who developed Gensin Impact?",
        "Guess my favorite character in Genshin Impact."
    };

    String[][] options = {
        { "A. Raiden Shogun", "B. Venti", "C. Condoriano" },
        { "A. 5", "B. 10", "C. 7" },
        { "A. electrical", "B. Electro", "C. Thunder" },
        { "A. Hoyoverse", "B. Riot Games", "C. Compass" },
        { "A. Bennett", "B. Yelan", "C. Yanfei" }
    };

    char[] answers = { 'B', 'C', 'B', 'A', 'C' };

    System.out.println("--------------------------");
    System.out.println("Welcome to Java Quiz Game!");
    System.out.println("--------------------------");

    Scanner scanner = new Scanner(System.in);

    char guess;
    int score = 0;

    for (int c = 0; c < questions.length; c++) {
      System.out.println(questions[c]);

      for (String option : options[c]) {
        System.out.println(option);
      }

      System.out.print("Enter your guess: ");
      guess = scanner.nextLine().charAt(0);

      if (Character.toUpperCase(guess) == answers[c]) {
        System.out.println("--------");
        System.out.println("Correct!");
        System.out.println("--------");

        score++;
      } else {
        System.out.println("--------");
        System.out.println(" Wrong ");
        System.out.println("--------");
      }

    }

    System.out.printf("Great your score is %d/%d!", score, questions.length);

    scanner.close();
  }
}
