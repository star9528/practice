
import java.util.Scanner;
public class Test {
    public static int water(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n % 3 == 0) {
            return n + water(n / 3);
        } else {
            if (n % 3 == 1) {
                return n - 1 + water(n / 3 + 1);
            } else {
                if (n % 3 == 2) {
                    return n - 2 + water(n / 3 + 2);
                } else return 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        while(s.hasNext()) {
            n = s.nextInt();
            System.out.println(water(n));
        }
    }
}
