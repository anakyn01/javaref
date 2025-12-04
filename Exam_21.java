abstract class Vehicle{ //추상 ㅋ ㄹ ㅅ 여서 객체를 만들수 ? 없다
    String name;

    abstract public String getName(String val); 
    //물려받는 애들에게 강제하겠끔 되어 있음 시그니처 생성자에 게터 와 세터

    
    public String getName(){ //getter
        return "Vehicle name: " + name;
    }
    public void setName(String val){//setter
        name = val;
    }
}

class Car extends Vehicle{ //갑시이 아니 법칙 (물고기 잡는법)
    public Car(String val){
        setName(val);
    }
    public String getName(String val){
        return "Car name:" + val;
    }
    public String getName(byte val[]){
        return "Car name:" + val;
    }
    public void newbe(){
        System.out.println("어 뉴비가 안보이네");
    }
}

public class Exam_21 {
    
    public static void main(String[] args) {
        Vehicle obj = new Car("Spark");// 추상클래스여서 new 바이클 못하고 반드시 상속받은 자식클래스에서 추상 메서드를 구현해야만 한다
        ((Car)obj).newbe();
        System.out.println(obj.getName()); 
    }
}
