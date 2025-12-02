class Par{
    public void fnP(){
        System.out.println("아임 유어 파더");
    }
}
class Mother extends Par{
    public void fnM(){
        System.out.println("나는 너에 어머니다");
    }
}

public class Inherit_12 {
    public static void main(String[] args){
        Mother m = new Mother();
        m.fnP();
        m.fnM();
    }
}
/*
클래스 상속(Inheritance)개념
- 어떤 객체가 있을때 그 객체의 변수와 메서드를 
다른 물려 받는거
- 자식 클래스를 생성하면 무조건 부모 클래스의 
생성자를 실행한루 자식 클래스의 생성자를 실행합니다
*/
