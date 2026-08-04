import java.util.Scanner;
import java.util.function.Function;

public class SalaryTransformationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Salary Transformation System =====");

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Functional Programming (Lambda Expressions)
        Function<Double, Double> hra = salary -> salary * 0.20;
        Function<Double, Double> da = salary -> salary * 0.10;
        Function<Double, Double> grossSalary =
                salary -> salary + hra.apply(salary) + da.apply(salary);
        Function<Double, Double> tax =
                gross -> (gross <= 50000) ? gross * 0.05 : gross * 0.10;

        double gross = grossSalary.apply(basicSalary);
        double taxAmount = tax.apply(gross);
        double deductions = 1000.0;
        double netSalary = gross - taxAmount - deductions;

        System.out.println("\n========== Salary Slip ==========");
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Name    : " + empName);
        System.out.println("Basic Salary     : " + basicSalary);
        System.out.println("HRA (20%)        : " + hra.apply(basicSalary));
        System.out.println("DA (10%)         : " + da.apply(basicSalary));
        System.out.println("Gross Salary     : " + gross);
        System.out.println("Tax              : " + taxAmount);
        System.out.println("Other Deductions : " + deductions);
        System.out.println("Net Salary       : " + netSalary);
        System.out.println("=================================");

        sc.close();
    }
}