import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            for (int i = 0; i < a; i++) {
                int t1 = in.nextInt();
                int t2 = in.nextInt();
                for (int j = 0; j < 2 * t1; j++) {
                    int num = in.nextInt();
                    stack.add(num);
                }
            }
            washPoke(stack);
            while (!stack.isEmpty()) {
                int n = stack.pop();
                System.out.print(n);
                if (!stack.isEmpty()) {
                    System.out.print(" ");
                } else {
                    continue;
                }
            }
        }
    }

    private static void washPoke(Stack<Integer> stack) {
        Stack<Integer> stack1 = new Stack<>();
        int size = stack.size();
        int[] arr1 = new int[size / 2];
        int[] arr2 = new int[size / 2];
        for (int i = 0; i < size / 2; i++) {
            arr1[i] = stack.pop();
        }
        for (int i = 0; i < size / 2; i++) {
            arr2[i] = stack.pop();
        }
        int i = 0;
        while (i < size / 2) {
            stack1.add(arr2[i]);
            stack1.add(arr1[i]);
        }
    }
}