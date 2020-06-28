import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            int a = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int b = in.nextInt();
                arr[i] = b;
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] <= a) {
                    a = a + arr[i];
                } else {
                    int t = greatestCommonDivisor(a,arr[i]);
                    a =t + a;
                }
            }
            System.out.println(a);
        }
    }

    private static int greatestCommonDivisor(int x, int y) {
        if(x>y){
            int t = x;
            x = y;
            y = t;
        }
        while(x!=0){
            int temp = y%x;
            y = x;
            x = temp;
        }
        return y;
    }
}