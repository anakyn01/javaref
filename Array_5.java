public class Array_5 {

    public static void main(String[] args ){
//쬐금
int[][] d = {{1,2}, {3}, {4,5,6}};
System.out.println(d.length);
System.out.println("++++++++++++++++++++++");
System.out.println(d[0].length);
System.out.println("++++++++++++++++++++++");
System.out.println(d[1].length);
System.out.println("++++++++++++++++++++++");
System.out.println(d[2].length);
System.out.println("++++++++++++++++++++++");




        //2021년 1회 문제
int[][] c = new int[10][3];
System.out.println(c.length);
System.out.println(c[0].length);
System.out.println("++++++++++++++++++++++");

        int[][] b = new int[3][2];
        //3개의 1차원 배열
        //첫번째 1차원 배열에 각각 갯수가 2
        System.out.println(b.length);
        System.out.println(b[0].length);



        String des = "배열은 같은 타입의 변수들로 이루어진 집합이다";
        //1차원 배열에 length속성
        int[]a = new int[3];//비어진 배열에 3개의 어레이값을 넣는다는 의미
        System.out.println(a.length);

    }
    
}
