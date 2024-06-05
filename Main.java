/**
 * Main
 */
public class Main {

    static int count = 0;

    public static void fun(int m) {

        if (m <= 0) {
            return;
        }

        fun(m - 1);
        System.out.println(count++);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        fun(10);
    }
}