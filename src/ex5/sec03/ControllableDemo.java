package ex5.sec03;

public class ControllableDemo {
  public static void main(String[] args) {
    TV tv = new TV();
    tv.turnOn();
    tv.turnOff();
    tv.repair();

    Computer computer = new Computer();
    computer.turnOn();
    computer.turnOff();
    computer.repair();

    Controllable.reset();
  }
}
