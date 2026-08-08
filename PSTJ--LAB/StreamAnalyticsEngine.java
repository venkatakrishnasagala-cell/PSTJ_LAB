import java.util.Scanner;
import java.util.function.IntPredicate;

public class StreamAnalyticsEngine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of data values: ");
        int n = sc.nextInt();

        int[] data = new int[n];

        System.out.println("Enter data values:");

        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        IntPredicate isHighValue = value -> value >= 50;

        int sum = 0;
        int highValues = 0;
        int maximum = data[0];
        int minimum = data[0];

        for (int value : data) {
            sum += value;

            if (isHighValue.test(value)) {
                highValues++;
            }

            if (value > maximum) {
                maximum = value;
            }

            if (value < minimum) {
                minimum = value;
            }
        }

        double average = (double) sum / n;

        System.out.println("\n----- STREAM ANALYTICS RESULT -----");
        System.out.println("Total Values  : " + n);
        System.out.println("Sum           : " + sum);
        System.out.println("Average       : " + average);
        System.out.println("Maximum       : " + maximum);
        System.out.println("Minimum       : " + minimum);
        System.out.println("High Values   : " + highValues);

        sc.close();
    }
}