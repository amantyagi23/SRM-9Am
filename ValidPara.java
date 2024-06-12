import java.util.Stack;

public class ValidPara {
    public static void main(String[] args) {
        String s = "(])";

        Stack<Character> stack = new Stack<Character>();

        boolean isValid = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                if ((ch == '}' && stack.peek() == '{') || (ch == ']' && stack.peek() == '[')
                        || (ch == ')' && stack.peek() == '(')) {

                    stack.pop();
                } else {
                    return false;
                }

            }
        }

        if (stack.isEmpty()) {
            isValid = true;
        }

        System.out.println(isValid);
    }
}
