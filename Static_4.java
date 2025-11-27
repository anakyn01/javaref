class Soojebi{
    static int count = 0;
}
public class Static_4{
    public static void main(String[] args){
       Soojebi s = new Soojebi();
       s.count++; 
       System.out.println(s.count);
       s.count++; 
       System.out.println(s.count);
    }
}
/*
변수를 선언할때 static키워드를 붙여줌
프로그램이 시작되면 변수가 생성되고 
프로그램이 종료되면 변수가 소멸된다
프로그램 전체에 사용할수 있다
*/