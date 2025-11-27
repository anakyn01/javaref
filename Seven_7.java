public class Seven_7 {
    
    public static void main(String[] args){
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = new String("abc");
        String e = a;
        System.out.println(a == b);//T
        System.out.println(a == c);//f
        System.out.println(b == e);//T
        System.out.println(c == d);//f
        System.out.println(d == e);//
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(e));
        System.out.println(c.equals(d));
        System.out.println(d.equals(e));

    }
}
