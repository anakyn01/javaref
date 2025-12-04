class A{
    private int a;

    //생성자
    public A(int a){
        this.a = a;
    }

    public void display(){
        System.out.println("a=" + a);
    }
}

class B extends A{
    public B(int a){
        super(a);//본래 주인이 A라 B를 호출해도 A가 나온다
        super.display();
    }
}

public class Exam_19 {

    public static void main(String[] args){
        B obj = new B(10);
        System.out.println(obj);
    }
    
}
