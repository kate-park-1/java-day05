package ex5.sec01;

public abstract class Shape {
  double pi = 3.14;
  abstract void draw();
  public double findArea(){
    return 0.0;
  }
}

class Circle extends Shape{
  int radius ;
  public Circle(int radius){
    this.radius = radius;
  }
  @Override
  void draw() {
    System.out.println("원을 그리다.");
  }

  @Override
  public double findArea() {
    return pi * radius * radius;
  }
}

class Rectangle extends Shape{
  int width , height ;

  public Rectangle(int width , int height){
    this.width = width;
    this.height = height;
  }
  @Override
  void draw() {
    System.out.println("사각형을 그리다.");
  }

  @Override
  public double findArea() {
    return (double) (width * height);
  }
}
