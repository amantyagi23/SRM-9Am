public class TreeR {

    static void fun(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println("Pre " + n);
        fun(n - 1);
        System.out.println("inner " + n);
        fun(n - 2);
        System.out.println("post " + n);
    }

    public static void main(String[] args) {
        fun(3);
    }
}
