package ex5.exercise;

public class PhoneTest {
  public static void main(String[] args) {
    Phone[] phones = {new Phone("황진이"),
                      new Telephone("길동이", "내일"),
                      new SmartPhone("민국이", "갤러그")};

    for (Phone phone : phones) {
      if(phone instanceof SmartPhone) {
        SmartPhone smartPhone = (SmartPhone) phone;
        smartPhone.playGame();
      } else if(phone instanceof Telephone) {
        Telephone telephone = (Telephone) phone;
        telephone.autoAnswering();
      } else if(phone instanceof Phone) {
        phone.talk();
      }
    }
  }
}
