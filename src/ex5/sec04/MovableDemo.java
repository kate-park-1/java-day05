package ex5.sec04;

public class MovableDemo {
  public static void main(String[] args) {
    Movable m = new Car(); // upcasting
    m.move(5);
    //m.show();

    Car car = (Car)m; // downcasting
    car.move(5);
    car.show();
  }
}
