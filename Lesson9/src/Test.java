import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       int a = 0113;
        System.out.println(a);
        int b =0x4ABC;
        System.out.println(b);
        long startTime = System.currentTimeMillis();
        System.out.println("---------------");
        System.out.println(fact(50));
        System.out.println("--------------- FACT TIME = " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        System.out.println(factR(50));
        System.out.println("--------------- FACT TIME = " + (System.currentTimeMillis() - startTime));
        System.out.println(fibonachi(7));
    }
    public static long fact(int n){
        long result =1;
        for (int i = 2; i <=n; i++) {
            result=result*i;
        }
        return result;
    }

    public static long factR(int n){
        if(n==0 || n==1)
            return 1;
        return n*factR(n-1);
    }
public static int fibonachi(int n){
    if(n==1 || n==2)
        return 1;
    return fibonachi(n-1)+fibonachi(n-2);
}

}
