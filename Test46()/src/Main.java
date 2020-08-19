import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.nextLine();
            String[] str = a.split(" ");
            for (int i = str.length - 1;i >= 0;i--) {
                if (i != 0) {
                    System.out.print(str[i] + " ");
                } else {
                    System.out.print(str[i]);
                }
            }
        }
    }
}