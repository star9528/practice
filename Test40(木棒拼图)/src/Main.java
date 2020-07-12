import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            long side = 0;
            int num = 0;
            for (int i = 1;i <= n;i++) {
                int type = in.nextInt();
                long Length = in.nextInt();
                if (type == 1) {
                    side = side + Length;
                    num++;
                } else {
                    side = side - Length;
                    num--;
                }
                if (num < 3) {
                    System.out.println("No");
                } else if (side - Length <= Length) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        }
    }
}