import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.nextLine();
            char[] c = a.toCharArray();
            for(int i = 0;i < c.length;i++) {
                if (( (c[i]< 'a') || (c[i] > 'z')) && ((c[i] > 'Z') || (c[i] < 'A'))) {
                    c[i] = ' ';
                }
            }
            a = new String(c);
            String[] str = a.split(" ");
            for(int i = str.length - 1;i >= 0;i--) {
                if (i != 0) {
                    System.out.println(str[i] + " ");
                } else {
                    System.out.println(str[i]);
                }
            }
        }
    }
}