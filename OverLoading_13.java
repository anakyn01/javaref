class Over {
    public void same(){
        System.out.println("A");
    }
    public void same(int i){
        System.out.println(i);
    }
    public void same(double d){
        System.out.println(d);
    }
    public int same(int a, int b){
        return a  + b;
    }
}

public class OverLoading_13 {
    public static void main(String[] args) {
        Over o = new Over();
        o.same();
        o.same(7);
        o.same(10.0);
        System.out.println(o.same(2, 3));
    }
}

/*
동일이름의 메서드를 매개변수만 다르게 하여 여러개 정의할수
있는 기능
- 오버로딩 특징 -
1) 매서드 이름이 같아야 한다
2) 매개변수 개수가 달라야 한다
3) 매개변수 개수가 같을 경우 데이터 타입이 달라야 한다
4) 반환형은 같거나 달라도 된다
*/