package ex5.sec03;

public class Notebook extends Computer implements Portable{

  @Override
  public void inMyBag() {
    System.out.println("노트북이 가방안에 있다.");
  }

  @Override
  public void turnOn() {
    System.out.println("노트북 전원을 켠다.");
  }

  @Override
  public void turnOff() {
    System.out.println("노트북 전원을 끈다.");
  }

  @Override
  public void repair() {
    System.out.println("노트북을 수리한다.");
  }
}
