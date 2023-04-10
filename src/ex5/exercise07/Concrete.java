package ex5.exercise07;

public class Concrete extends AbstractClass {
  int j;
  public Concrete(int i, int j) {
    super(i);
    this.j = j;
  }

  @Override
  void show() {
    System.out.printf("i = %d, j = %d\n", i, j);
  }
}
