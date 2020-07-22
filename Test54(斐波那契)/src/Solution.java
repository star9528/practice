import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> filter;

    public int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        filter = new HashMap<>();
        int pre = 0;
        if (filter.containsKey(n - 1)) {
            pre = filter.get(n - 1);
        } else {
            pre = Fibonacci(n - 1);
            filter.put(n - 1, pre);
        }
        int ppre = 0;
        if (filter.containsKey(n - 2)) {
            ppre = filter.get(n - 2);
        } else {
            ppre = Fibonacci(n - 2);
            filter.put(n - 2, ppre);
        }
        return pre + ppre;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.Fibonacci(45));
    }
}