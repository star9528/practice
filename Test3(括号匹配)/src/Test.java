import java.util.Scanner;
import java.util.Stack;

public class Test {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> s = new Stack<>();
//        char[] c = A.toCharArray();
//        if (c[0] == ')') {
//            return false;
//        }
//        for (int i = 0;i < n;i++) {
//            if (c[i] != '(' && c[i] != ')'){
//                return false;
//            }
//            if (c[i] == '(' ) {
//                s.push(c[i]);
//            }
//            if (c[i] == ')') {
//                s.pop();
//            }
//        }
        for (int i = 0; i < n; i++) {
            char c = A.charAt(i);
            if (c != '(' && c != ')'){
                return false;
            }
            if (c == '(' ) {
                s.push(c);
            }
            if (c == ')') {
                if (s.isEmpty()) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        if (!s.isEmpty()) {
            return false;
        } else return true;
    }

    public static void main(String[] args) {
        Test t = new Test();
        String a = "()()(()))))";
        System.out.println(t.chkParenthesis(a, 11));
    }
}
