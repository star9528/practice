import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();//队头
    Stack<Integer> stack2 = new Stack<Integer>();//队尾

    public void push(int node) {
        while (!stack2.isEmpty()) {
            int temp = stack2.pop();
            stack1.push(temp);
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            int temp = stack1.pop();
            stack2.push(temp);
        }
        return stack2.pop();
    }
}
