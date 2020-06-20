
import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int x = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                x ^= arr[i];
            }
            //此时 x 为两个出现 1 次的数的异或结果
            int index = 0;  //index 记录 x 第一个位为 1 的位置
            for (int i = 0; i < 32; i++) {
                if (((x >> i) & 1) == 1) {
                    index = i;
                    break;
                }
            }
            //将数组分为两部分
            int num1 = 0;   //第一部分的异或结果
            int num2 = 0;   //第二部分的异或结果
            for (int i = 0; i < n; i++) {
                if (((arr[i] >> index) & 1) == 1) {     //index位为 1
                    num1 ^= arr[i];
                } else {    //index位为 0
                    num2 ^= arr[i];
                }
            }
            // 从小到大输出
            if (num1 < num2) {
                System.out.println(num1 + " " + num2);
            } else {
                System.out.println(num2 + " " + num1);
            }
        }
    }
}