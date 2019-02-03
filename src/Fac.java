import java.util.Scanner;

/**
 * Created by alice on 03.02.2019.
 */
public class Fac {
    static int fac (int n){
        int result=1;
        for (int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;
    }

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        Integer n = scanner.nextInt();
        System.out.println( n + "! = " + fac(n));
    }
}
