import java.util.Scanner;

/**
 * Created by alice on 03.02.2019.
 */
public class CalculationUsage {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        Integer n = scanner.nextInt();

        if(n<0) {
            System.out.println(n + "! = calculation of negative factorial not possible" );
        } else {
            System.out.println("factorial calculation: ");
            System.out.println( n + "! = " + Fac.fac(n));
            System.out.println("recursive factorial calculation: ");
            System.out.println(n + "! = " + Fac.recfac(n));
        }

        KiBa.kibacount(n);
    }
}
