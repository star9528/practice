import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String overTurn(int n) {
        Stack<String> queue = new Stack<>();
        while(n != 0) {
            int m = n % 10;
            if (m == 0) {
                queue.add("0");
            }
            if (m == 1) {
                queue.add("1");
            }
            if (m == 2) {
                queue.add("2");
            }
            if (m == 3) {
                queue.add("3");
            }
            if (m == 4) {
                queue.add("4");
            }
            if (m == 6) {
                queue.add("6");
            }
            if (m == 7) {
                queue.add("7");
            }
            if (m == 8) {
                queue.add("8");
            }
            if (m == 9) {
                queue.add("9");
            }
            if (m == 5) {
                queue.add("5");
            }
            n = n / 10;
        }
        String s = "";
        while(!queue.isEmpty()) {
            s =queue.pop() + s;
        }
        return s;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            System.out.println(m.overTurn(a));
        }
    }
}