package ex5.sec03;

public class ControllableDemo2 {
  public static void main(String[] args) {
    Controllable[] controllables = new Controllable[3];
    // {new TV(),...
    controllables[0] = new TV();
    controllables[1] = new Computer();
    controllables[2] = new Notebook();

    for(Controllable controllable : controllables) {
      controllable.turnOn();
      controllable.turnOff();
      controllable.repair();
      //controllable.inMyBag();
    }
    Controllable.reset();
  }
}
