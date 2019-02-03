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
}
