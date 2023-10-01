import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // Populate the ArrayList with days of the week
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Input temperatures for each day
        for (String day : daysOfWeek) {
            System.out.print("Enter average temperature for " + day + ": ");
            double temperature = scanner.nextDouble();
            temperatures.add(temperature);
        }

        // Calculate and display the weekly average
        double weeklySum = 0;
        for (double temperature : temperatures) {
            weeklySum += temperature;
        }
        double weeklyAverage = weeklySum / temperatures.size();

        // Display the results
        System.out.println("\nWeekly Temperatures:");
        for (int i = 0; i < daysOfWeek.size(); i++) {
            System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i));
        }
        System.out.println("Weekly Average: " + weeklyAverage);

        scanner.close();
    }
}
