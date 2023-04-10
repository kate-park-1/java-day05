package ex5.sec01;

public class ShapeDemo {
  public static void main(String[] args) {
    //Shape shape = new Shape();
    Circle circle = new Circle(3);
    circle.draw();
    System.out.printf("원의 넓이는 %.1f \n", circle.findArea());
    Shape shape = new Circle(3);

    Rectangle rectangle = new Rectangle(3,4);
    rectangle.draw();
    System.out.println("사각형의 넓이는 " + rectangle.findArea());
  }
}
