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

    static int recfac (int n) {
        int result = 0;
        if (n == 0) {
            result = 1;
        } else if (n == 1) {
            result = 1;
        } else if (n > 1) {
            result = (n * recfac(n - 1));
        }
        return result;
    }

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        Integer n = scanner.nextInt();

        if(n<0) {
            System.out.println(n + "! = calculation of negative factorial not possible" );
        } else {
            System.out.println("factorial calculation: ");
            System.out.println( n + "! = " + fac(n));
            System.out.println("recursive factorial calculation: ");
            System.out.println(n + "! = " + recfac(n));
        }
    }
}
