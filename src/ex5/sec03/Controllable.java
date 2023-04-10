package ex5.sec03;

/**
 * turnOn()/turnOff()는 반드시 구현해야함
 * repair()는 필요한 경우 구현
 * @param
 * */
public interface Controllable {
  void turnOn();
  void turnOff();
  default void repair(){
    System.out.println("장비를 수리한다.");
  }
  static void reset(){
    System.out.println("장비를 초기화한다.");
  }
}
