//결합도 낮추고 응집도는 최대화 한다
interface A{
    void fn();
}

class B implements A{
    public void fn(){
        System.out.print("B");
    }
}

class C implements A{
    public void fn(){
        System.out.print("C");
    }
}

public class Inter_17 {
    public static void main(String args[]){
        A b = new B();
        A c = new C();
        b.fn();
        c.fn();
    }
}
/*
인터페이스는 저바의 다형성을 극대화 하여..
쉬는시간 짜짝~ 개발코드 수정을 줄이고
프로그램의 유지보수성을 높이기 위한 문법이다
오직 추상메서드와 상수만을 멤버로 가질수 있고
그외의 다른 어떠한 요소도 허용하지 않는다
인터페이스는 구현된 것은 아무것도 없고 밑그림만
그려져 있는 기본 설계도라 할수 있습니다
*/