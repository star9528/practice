import java.util.*;

public class LCA {
    public int getLCA(int a, int b) {
        // write code here
        if (a == b) {
            return a;
        } else {
            while(a != b) {
                if (a > b) {
                    a = a / 2;
                }
                if (a < b) {
                    b = b / 2;
                }
            }
            return a;
        }
    }
}