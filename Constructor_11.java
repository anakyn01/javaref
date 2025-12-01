//생성자에 관련되어 있는 문제는 2020년 3회, 2023년 1회
public class Constructor_11 {
    
    public Constructor_11(){
        System.out.println("A");
    }
    public Constructor_11(int a){
        System.out.println(" B: " + a);
    }
    public void fn(){
       System.out.println("C"); 
    }
    public static void main(String[] args){
        Constructor_11 c11 = new Constructor_11();
        Constructor_11 c12 = new Constructor_11(5);
        c11.fn();
        c12.fn();
    }
}
/*
생성자란
- 해당 클래스의 객체가 생성될때 자동으로 호출되는 특수한 종류의 메서드
- 일반적으로 클래스의 맴버변수를 초기화 하거나
- 클래스를 사용하는데 필요한 설정이 필요한 경우 사용한다
- 생성자는 클래스명 동일한 메서드명을 가지고 리턴값이 없습니다
- 생성자가 없을경우 public 클래스명(){} 이라는 아무 일도 하지 않는 생성자가 
있는 것처럼 동작합니다
*/