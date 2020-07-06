import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.nextLine();
            String[] s = a.split(" ");
            for (int i = s.length - 1;i >= 0;i--) {
                if (i != 0) {
                    System.out.print(s[i] + " ");
                } else {
                    System.out.print(s[i]);
                }
            }
        }
    }
}