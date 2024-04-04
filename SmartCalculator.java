package SmartCalculator;

import java.util.Scanner;

public class SmartCalculator {
    private double principal;
    private double rate;
    private double time;
    private double[] numbers;
    private double totalMarks;
    private double marksObtained;

    // Constructor
    public SmartCalculator() {
        this.principal = 0;
        this.rate = 0;
        this.time = 0;
        this.numbers = null;
        this.totalMarks = 0;
        this.marksObtained = 0;
    }

    // Methods for calculations
    public double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }

    public double calculateCompoundInterest() {
        return principal * Math.pow(1 + rate / 100, time) - principal;
    }

    public double calculateMean() {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public double calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    public double calculatePercentage() {
        return (marksObtained / totalMarks) * 100;
    }

    // Method to display options and perform calculations
    public void calculateOptions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Calculate Simple Interest");
        System.out.println("2. Calculate Compound Interest");
        System.out.println("3. Calculate Mean");
        System.out.println("4. Calculate Factorial");
        System.out.println("5. Calculate Percentage");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter principal amount:");
                principal = scanner.nextDouble();
                System.out.println("Enter rate:");
                rate = scanner.nextDouble();
                System.out.println("Enter time:");
                time = scanner.nextDouble();
                System.out.println("Simple Interest: " + calculateSimpleInterest());
                break;
            case 2:
                System.out.println("Enter principal amount:");
                principal = scanner.nextDouble();
                System.out.println("Enter rate:");
                rate = scanner.nextDouble();
                System.out.println("Enter time:");
                time = scanner.nextDouble();
                System.out.println("Compound Interest: " + calculateCompoundInterest());
                break;
            case 3:
                System.out.println("Enter number of elements:");
                int n = scanner.nextInt();
                numbers = new double[n];
                System.out.println("Enter " + n + " numbers:");
                for (int i = 0; i < n; i++) {
                    numbers[i] = scanner.nextDouble();
                }
                System.out.println("Mean: " + calculateMean());
                break;
            case 4:
                System.out.println("Enter a number:");
                int num = scanner.nextInt();
                System.out.println("Factorial: " + calculateFactorial(num));
                break;
            case 5:
                System.out.println("Enter total marks:");
                totalMarks = scanner.nextDouble();
                System.out.println("Enter marks obtained:");
                marksObtained = scanner.nextDouble();
                System.out.println("Percentage: " + calculatePercentage());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {
        SmartCalculator calculator = new SmartCalculator();
        calculator.calculateOptions();
    }
}
