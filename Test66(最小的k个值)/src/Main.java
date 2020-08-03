import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                if (i == k - 1) {
                    System.out.println(arr[i]);
                } else {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}