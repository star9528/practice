import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            System.out.println(buyApple(num));
        }
    }
    public static int buyApple(int num) {
        //满足下面这些条件则一定不会买
        if (num < 6 || num % 2 != 0 || num == 10) {
            return -1;
        } else if (num % 8 == 0) {//只要不是上面的情况,一定能买
            return num / 8;
        } else {
            return 1 + num/8;
        }
    }
}