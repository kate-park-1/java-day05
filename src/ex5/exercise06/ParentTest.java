package ex5.exercise06;

public class ParentTest {
  public static void main(String[] args) {
    Parent p = new Parent();
    System.out.println(p.name);
    p.print();
    Parent p1 = new Child();
    System.out.println(p1.name);
    p1.print();
    Child c = new Child();
    System.out.println(c.name);
    c.print();
  }
}
