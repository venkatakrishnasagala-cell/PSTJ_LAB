import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Consumer;

public class SalaryTransformationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        Function<Double, Double> calculateHRA =
                salary -> salary * 0.20;

        Function<Double, Double> calculateDA =
                salary -> salary * 0.10;

        Function<Double, Double> calculateBonus =
                salary -> salary * 0.05;

        double hra = calculateHRA.apply(basicSalary);
        double da = calculateDA.apply(basicSalary);
        double bonus = calculateBonus.apply(basicSalary);

        double finalSalary = basicSalary + hra + da + bonus;

        Consumer<String> display =
                message -> System.out.println(message);

        display.accept("\n----- SALARY DETAILS -----");
        display.accept("Employee Name : " + name);
        display.accept("Basic Salary  : " + basicSalary);
        display.accept("HRA (20%)     : " + hra);
        display.accept("DA (10%)      : " + da);
        display.accept("Bonus (5%)    : " + bonus);
        display.accept("Final Salary  : " + finalSalary);

        sc.close();
    }
}
