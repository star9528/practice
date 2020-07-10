import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            double w = Math.pow((y - b), 2);
            double q = Math.pow((x - a), 2);
            double t = Math.pow((z - c), 2);
            double R = Math.pow((w + q + t),0.5);
            double V = (4.0 / 3.0) * Math.acos(-1) * Math.pow(R,3);
            System.out.println(String.format("%.3f", R) + " " + String.format("%.3f", V));
        }
    }
}