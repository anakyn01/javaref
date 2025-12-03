class A{
    public void fn(){
        System.out.println("A");
    }
}
class B extends A{
    public void fn(){
        super.fn();
        System.out.println("B");
    }
}



public class Super_15 {
    public static void main(String args[]){
        A a = new B();
        a.fn();
    }
    //자바는 super키워드를 사용하여 상위 클래스에 변수나 메서드에 접근할수 있습니다
    /*
    부모 클래스 내부 변수 접근 : super변수;
    부모 클래스 내부 메서드 접근 : super.메서드(매개변수);
    부모 클래스 내부 생성자 호출 : super(매개변수)
    */
}
