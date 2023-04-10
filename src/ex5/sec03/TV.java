package ex5.sec03;

public class TV implements Controllable{
  // 수리 기능 구현
  @Override
  public void turnOn() {
    System.out.println("TV를 켠다.");
  }

  @Override
  public void turnOff() {
    System.out.println("TV를 끈다.");
  }
}
