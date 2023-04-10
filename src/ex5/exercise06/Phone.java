package ex5.exercise06;
/*1. 각 클래스에 모든 필드를 초기화하는 생성자를 추가한다.
2. 각 클래스의 메서드를 구현한다. talk()는 owner가 통화 중, autoAnswering()은 owner가 부재중이니 when에 전화 요망, playGame()은 owner가 game 게임 중이라는 메시지를 출력한다.
3. Phone, Telephone, Smartphone 객체로 Phone 타입 변수에 대입한다. 그리고 반복문과 조건문으로 실제 타입을 조사한 후 Phone 타입이면 talk(), Telephone 타입이면 autoAnswering(), Smartphone 타입이면 playGame()을 호출한다.
*/
public class Phone {
  protected String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  void talk(){
    System.out.println(owner + "가 통화중입니다.");
  }
}

class Telephone extends Phone {
  private String when;

  public Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }

  public Telephone(String owner) {
    super(owner);
  }

  void autoAnswering() {
    System.out.println(owner + "가 부재중이니 " + when + " 전화바랍니다.");
  }
}

class SmartPhone extends Telephone {
  private String game;

  public SmartPhone(String owner, String game) {
    super(owner);
    this.game = game;
  }

  void playGame() {
    System.out.println(owner + "가 "+ game + " 게임중입니다.");
  }
}