public class CountDigit {

    static int countDigit(int n) {
        if (n == 0) {
            return 0;
        }

        return countDigit(n / 10) + 1;
    }

    static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }

        return sumOfDigit(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        int m = 123456;
        int count = 0;

        while (m != 0) {
            count++;
            m = m / 10;
        }

        // System.out.println(countDigit(123456));
        System.out.println(sumOfDigit(123456));
    }
}
