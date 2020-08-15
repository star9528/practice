import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int  p = 19;
        long value = p;
        Stack<Long> stack = new Stack<>();
        while(value != 1) {
            while(value != 0) {
                long t = value % 10;
                stack.add(t);
                value = value / 10;
            }
            while (!stack.isEmpty()) {
                value = (long) (value + Math.pow(stack.pop(),2));
            }
        }
        System.out.println(true);
    }
}
