import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String[] str = in.nextLine().split(" ");
            int[] arr = new int[str.length - 1];
            for(int i = 0;i < str.length - 1;i++) {
                arr[i] = Integer.valueOf(str[i]);
            }
            int num = Integer.valueOf(str[str.length - 1]);
            Arrays.sort(arr);
            for (int i = 0;i < num;i++) {
                if (i == num - 1) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}