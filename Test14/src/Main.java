import java.util.Scanner;
public class Main {
    public int fibonacci(int n) {
        if ( n  <= 1) {
            return 0;
        }
        int one = 0;
        int two = 1;
        int three = one + two;
        while (three < n) {
            one = two;
            two = three;
            three = one + two;
        }
        if (n == three) {
            return 0;
        } else {
            if ((n - two) > (three - n)) {
                return three - n;
            } else {
                return n - two;
            }
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            System.out.println(m.fibonacci(a));
        }
    }
}