public class DiceBoard {

    static String countDice(int currValue, int endValue, String result) {

        if (currValue == endValue) {
            return result + ", ";
        }

        if (currValue > endValue) {
            return "";
        }
        String res = "";
        for (int i = 1; i <= 6; i++) {
            if (currValue <= endValue) {
                currValue = currValue + i;
                res = res + countDice(currValue, endValue, result + i);
                currValue = currValue - i;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        System.out.println(countDice(0, 20, ""));
    }
}
