import java.util.Scanner;

public class MaximumProfitAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] profit = new int[n];

        System.out.println("Enter profit/loss values:");

        for (int i = 0; i < n; i++) {
            profit[i] = sc.nextInt();
        }

        int currentSum = profit[0];
        int maximumSum = profit[0];

        for (int i = 1; i < n; i++) {

            currentSum = Math.max(profit[i], currentSum + profit[i]);

            maximumSum = Math.max(maximumSum, currentSum);
        }

        System.out.println("\n----- MAXIMUM PROFIT ANALYSIS -----");
        System.out.println("Maximum Profit : " + maximumSum);

        sc.close();
    }
}