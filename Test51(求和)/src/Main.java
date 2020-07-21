import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            int m = in.nextInt();
            List<Integer> list = new ArrayList<>();
            int up = n > m ? m : n;
            printList(m, up, list);
        }
    }
    public static void printList(int m,int n, List<Integer> list) {
        if(m == 0){
            System.out.println(list);
            return;
        }
        if (n<= 0|| m < 0) {
            return;
        }
        List<Integer> list1 = new ArrayList<>(list);
        printList(m, n - 1, list);
        list1.add(n);
        printList(m - n, n - 1, list1);
    }
}