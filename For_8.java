/*
for each
배열이나 리스트의 크기만큼 반복하는데 
반복할때 마다 배열이나 리스트의 항목을 
순차적으로 변수에 대입하는 반복문
*/

public class For_8 {
    
    public static void main(String[] args) {
        String[] name ={"song","lee","park","song","lee","park","song","lee","park","song","lee","park","song","lee","park"};
        for(String nm:name){
            System.err.println(nm);
        }
    }
}
