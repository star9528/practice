import java.util.*;

public class Count2 {
    public int countNumberOf2s(int n) {
        if (n < 10) {
            return 1;
        }
        if (n < 20) {
            return 2;
        }
        int m = 2;
        for (int i = 20;i <= n;i++) {
            int temp = i;
            while (temp != 0) {
                if (temp % 10 == 2) {
                    m++;
                }
                temp = temp / 10;
            }
        }
        return m;
    }
}