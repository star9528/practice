import java.util.*;

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] b = new boolean[n];
        if (p.length > 500 || s.length() > 1000) {
            return b;
        }
        for (int i = 0; i < n; i++) {
            boolean bol = s.contains(p[i]);
            b[i] = bol;
        }
        return b;
    }
}
