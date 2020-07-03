import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            int n2 = n * n;
            int i = 1;
            Boolean f = false;
            while(!f) {
                if(n2 % (Math.pow(10,i)) == n) {
                    System.out.printf("YES!");
                    f = true;
                }
                if (n2 % (Math.pow(10,i)) == n2) {
                    System.out.printf("NO!");
                    f = true;
                }
                i++;
            }
        }
    }
}