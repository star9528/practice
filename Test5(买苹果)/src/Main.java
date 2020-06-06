import java.util.Scanner;
public class Main {
    public int type1 = 6;
    public int type2 = 8;
    public int buyApple(int n) {
        if (n < 0 || n > 100) {
            return -1;
        }
        for (int i = 0;i < n / 6 + 1;i++) {
            if(i * type1 == n) {
                return i;
            }
            for (int j = 0;j < n / 8 + 1;j++) {
                if (j * type2 + i * type1 == n) {
                    return j + i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            System.out.println(m.buyApple(a));
        }
    }
}