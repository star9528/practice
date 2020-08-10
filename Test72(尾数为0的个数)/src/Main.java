import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int n = in.nextInt();
            int count = 0;
            for (int i = n;i > 0;i--) {
                int num = i;
                while(num % 5 == 0) {
                    count++;
                    num = num / 5;
                }
            }
            System.out.println(count);
        }
    }
}