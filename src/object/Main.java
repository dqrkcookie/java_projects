package object;

public class Main {
  public static void main(String[] args) {

    Car car1 = new Car("Honda", "Matte Black");
    Car car2 = new Car("Ford", "Pearl White");

    System.out.printf("You are using %s color is %s\n", car1.model, car1.color);
    System.out.printf("You are using %s color is %s\n", car2.model, car2.color);

  }
}
