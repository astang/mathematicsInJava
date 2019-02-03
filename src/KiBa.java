import java.util.Scanner;

/**
 * Created by alice on 03.02.2019.
 */
public class KiBa {
    static int kibacount (int n) {
        int currentnumber = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(" KiiBaa ");
            }
            else if (i % 3 == 0) {
                System.out.println(" Ki ");
            }
            else if (i % 5 == 0) {
                System.out.println(" Ba ");
            } else {
                System.out.println(i);
            }
        }
        return currentnumber+1;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println(kibacount(n));
    }
}
