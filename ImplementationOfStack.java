public class ImplementationOfStack {

    int size;
    int stack[];
    int top;

    ImplementationOfStack(int size) {
        this.size = 1000;
        stack = new int[size];
        this.top = -1;
    }

    void push(int item) {
        top++;
        stack[top] = item;
    }

    int pop() {
        return stack[top--];
    }

    void show() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ImplementationOfStack obj = new ImplementationOfStack(10);

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.show();
        System.out.println();
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println();
        obj.show();
    }
}
