import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            for (int i = 0;i <= 9;i++) {
                int num = 0;
                int n = a;
                while (n != 0) {
                    int m = n % 10;
                    if (m == i) {
                        num++;
                    }
                    n = n / 10;
                }
                if (num != 0) {
                    System.out.println(i + ":" + num);
                }
            }
        }
    }
}