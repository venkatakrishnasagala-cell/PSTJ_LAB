import java.util.Arrays;
import java.util.List;

public class StreamAnalyticsEngine {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(10, 20, 30, 40, 50);

        System.out.println("Data Stream: " + data);

        int sum = data.stream().mapToInt(Integer::intValue).sum();

        double average = data.stream().mapToInt(Integer::intValue).average().getAsDouble();

        int max = data.stream().mapToInt(Integer::intValue).max().getAsInt();

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
    }
}