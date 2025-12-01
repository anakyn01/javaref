/*
클래스 접근 제어자
지정된 클래스 변수 메서드를 외부 (같은 패키지나 )접근할수 있도록
권한을 설정하는 기능

클래스 접근제어자
public : 외부의 모든 클래스에 접근이 가능한 접근 제어자

protected : 같은패키지 내부에 있는 클래스, 하위 클래스(상속받은 경우)에서
접근이 가능한 접근 제어자
자기 자신과 상속받은 하위클래스 둘 다 접근이 가능한 접근 제어자

default : 접근 제어자를 명시하지 않는 경우로 같은 패키지 내부에 있는
클래스에서 접근이 가능한 접근 제어자

private : 같은 크래스내에서만 접근이 가능한 접근제어자

this: 현재 객체를 가르키는 키워드 입니다
클래스 내부의 변수와 메서드를 가리킬수 있습니다

클래스 내부 변수 접근 : this.변수
클래스 내부 메서드 접근 : this.메서드(매개변수)
클래스 내부 생성자 호출 : this(매개변수)
*/

public class Modifier_10 {

    //일반적으로 this에 의미는 어디서나 동일하나 단 화살표 함수에서 this는 기능의 소유자를 칭한다
    private int a;
    public void setA(int a){
        this.a = a;
        //this.a 는 클래스 내의 a의 변수 그냥a는 매개변수로 받은 변수
    }
    public int getA(){//getA 함수는 클래스 내의 a변수에 저장된 5를 리턴
        return a;
    }

    public static void main(String[] args) {//프로그램은 메인 메서드부터 시작
        Modifier_10 mod = new Modifier_10();
        //모드라는 변수에 Modifier_10클래스 생성
        mod.setA(5);//mod 클래스 변수 내에서 setA를 호출할때 5를 넘김
        System.out.println(mod.getA());//getA에 반환값 출력
    }
    
}
