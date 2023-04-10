package ex5.exercise06;

public class CarTest {
  public static void main(String[] args) {
    Car car = new Car("파랑", 200,1000,5);
    car.show();

    System.out.println();
    Vehicle v = car;
    v.show();
  }
}
