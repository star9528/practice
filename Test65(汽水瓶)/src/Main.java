import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println(drink(n));
        }
    }
    public static int drink(int n) {
        int sum = 0;//多喝的汽水的瓶数
        while(n > 2) {
            sum = sum + n / 3;
            n = n / 3 + n % 3;
        }
        if (n == 2) {//只有两瓶水的时候可以多喝一瓶
            sum = sum + 1;
        }
        return sum;
    }
}