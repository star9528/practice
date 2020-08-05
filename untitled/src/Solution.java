import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();//头
    Stack<Integer> stack2 = new Stack<Integer>();//尾

    public void push(int node) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack2.push(node);
    }

    public int pop() {
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return stack1.pop();
    }
}