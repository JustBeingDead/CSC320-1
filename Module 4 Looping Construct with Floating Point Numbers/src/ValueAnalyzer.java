import java.util.Scanner;

public class ValueAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        int count = 0;
        while (count < 5) {
            System.out.print("Enter a floating-point value: ");
            if (input.hasNextDouble()) {
                double value = input.nextDouble();
                total += value;

                if (value > max) {
                    max = value;
                }

                if (value < min) {
                    min = value;
                }

                count++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point value.");
                input.next(); // Consume the invalid input
            }
        }

        double average = total / 5;
        double interest = total * 0.20;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);

        input.close();
    }
}