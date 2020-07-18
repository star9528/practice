import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int[] arr = new int[a];
            for(int i = 0;i < a;i++) {
                arr[i] = in.nextInt();
            }
            int max = arr[0];
            int res = arr[0];
            for (int i = 1;i < arr.length;i++) {
                res = Math.max(res + arr[i],arr[i]);
                max = Math.max(max,res);
            }
            System.out.println(max);
        }
    }
}