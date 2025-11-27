public class Str_6 {

    public static void main(String[] args){
//2023년 2회
String qq = "abc";//answkduf 리xj럴
String ww = "abc";//상동
String ee = new String("abc");//객체 : 어떤 리터럴이나 서로에게 결코 해당되지 않습니다
String rr = new String("abc");//
String tt = qq;

System.out.println(qq == ww);//타입를 봄
System.out.println(qq == ee);
System.out.println(ww == rr);
System.out.println(rr == ww);
System.out.println(tt == ee);
System.out.println(qq.equals(ww));//내용을 봄
System.out.println(qq.equals(ee));
System.out.println(ww.equals(rr));
System.out.println(rr.equals(ww));
System.out.println(tt.equals(ee));

        String a = "12"; String b = "3";
        System.out.println(a + b);
        int q = 12; int w = 3;
        System.out.println(q + w);

        //변수로 안만들고 더할수 있다
        System.out.println(5 + 2);
        System.out.println("5" + "2");
    }
    
}
