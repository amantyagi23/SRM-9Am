public class DiceBoard {

    static void countDice(int currValue, int endValue, String result) {

        if (currValue == endValue) {
            System.out.print(result + ", ");
            return;
        }

        if (currValue > endValue) {
            return;
        }
        for (int i = 1; i <= 6; i++) {
            if (endValue >= currValue) {
                currValue = currValue + i;
                countDice(currValue, endValue, result + i);
                currValue = currValue - 1;
            }

        }
    }

    public static void main(String[] args) {
        countDice(0, 20, "");
    }
}
