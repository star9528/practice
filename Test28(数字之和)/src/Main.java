import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int p = a * a;
            int sum = 0;
            int pSum = 0;
            while (a != 0) {
                sum = sum + a % 10;
                a = a / 10;
            }
            while (p != 0) {
                pSum = pSum + p % 10;
                p = p / 10;
            }
            System.out.printf(sum + " " + pSum);
        }
    }
}