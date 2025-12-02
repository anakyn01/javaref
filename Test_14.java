class Parent{
    public Parent(){
        System.out.println("A");
    }
    public Parent(int a){
        System.out.println("B");
    }
    public Parent(double c){
        System.out.println("c");
    }
    public void fn(){
        System.out.println("d");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("d");
    }
    public Child(double c){
        //super(a);
        super(c);
        System.out.println("e");
    }
    public void fn(){
        System.out.println("f");
    }
}

public class Test_14 {
    public static void main(String[] args) {
        Parent a = new Parent();
        Parent b = new Parent(1);
        Parent c = new Parent();
        Parent d = new Parent(1);
        Child e = new Child();
        Child f = new Child(3.00);
        a.fn();
        e.fn();
    }
}
