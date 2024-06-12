import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int num1[] = { 4, 1, 2 };
        int num2[] = { 1, 3, 4, 2 };

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < num2.length; i++) {
            while (!stack.isEmpty() && stack.peek() < num2[i]) {
                map.put(stack.pop(), num2[i]);

            }
            stack.push(num2[i]);
        }

        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        for (Map.Entry<Integer, Integer> value : map.entrySet()) {
            System.out.println(value);
        }
    }
}
