public class Method_9 {

    static char fn(int num){
        //single statement 10000 run syntax ko
        if(num % 2 == 0)
            return 'Y';
        else
            return 'N';
    }
    
    public static void main(String[] args) {
        char a = fn(5);
        System.out.print(a);
    }
}
