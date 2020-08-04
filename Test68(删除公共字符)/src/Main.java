import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            char[] c = in.nextLine().toCharArray();
            String str = in.nextLine();
            for (int i = 0;i < c.length;i++) {
                if (!str.contains(String.valueOf(c[i]))) {
                    System.out.print(c[i]);
                }
            }
        }
    }
}