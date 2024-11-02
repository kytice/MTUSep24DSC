package package1;
import java.util.Stack;

public class Lab3_Stack {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (isOpen(ch)) {
                stack.push(ch);
            } else if (isClose(ch)) {
                if (stack.isEmpty() || !areMatching(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpen(char ch) {
        return ch == '(' || ch == '{' || ch == '[' || ch == '<';
    }

    private static boolean isClose(char ch) {
        return ch == ')' || ch == '}' || ch == ']' || ch == '>';
    }

    private static boolean areMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']') ||
                (open == '<' && close == '>');
    }
}