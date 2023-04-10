package ex5.exercise;

public class ParentTest {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name);
    p.print();
  }
}
