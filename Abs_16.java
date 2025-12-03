abstract class A{
    abstract void fn();
}
class B extends A {
    void fn(){
        System.out.print("B");
    }
}
class C extends A{

   void fn(){
        System.out.print("B");
        System.out.println("bbb");
    } 
}

public class Abs_16 {
    public static void main(String[] args){
        A b = new B();
        A c = new C();
        b.fn();
        c.fn();
    }
}
/*
추상 클래스는 미구현 추상메서드를 한개 이상 가지고
자식 클래스에서 해당 추상 메서드를 반드시 구현하도록 
강제하는 기능 2020년 3회
*/