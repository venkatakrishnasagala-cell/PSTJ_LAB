public class MaximumProfitAnalyzer {
public static void main(String[] args) {

    int[] profit = {-2, 3, -1, 5, -6, 4};

    int currentSum = 0;
    int maxProfit = 0;

    for (int i = 0; i < profit.length; i++) {
        currentSum = currentSum + profit[i];

        if (currentSum < 0) {
            currentSum = 0;
        }

        if (currentSum > maxProfit) {
            maxProfit = currentSum;
        }
    }

    System.out.println("Maximum Profit = " + maxProfit);
}

}