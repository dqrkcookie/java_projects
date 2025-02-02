import java.util.Scanner;

public class grade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double eng, math, fil, sci, tle, his;

    System.out.print("Enter the grade in English: ");
    eng = scanner.nextDouble();
    System.out.print("Enter the grade in Math: ");
    math = scanner.nextDouble();
    System.out.print("Enter the grade in Filipino: ");
    fil = scanner.nextDouble();
    System.out.print("Enter the grade in Science: ");
    sci = scanner.nextDouble();
    System.out.print("Enter the grade in TLE: ");
    tle = scanner.nextDouble();
    System.out.print("Enter the grade in History: ");
    his = scanner.nextDouble();

    System.out.println(average(eng, math, fil, sci, tle, his));

    scanner.close();
  }

  static double average(double... grades) {

    int sum = 0;

    if (grades.length == 0) {
      return 0;
    }

    for (double grade : grades) {
      sum += grade;
    }

    return sum / grades.length;
  }

}
