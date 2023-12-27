import java.util.Scanner;

public class App {
    // Function to calculate the summation part of the series
    static double sigma(double c, double gn, int n) {
        double result = 0.0;
        // Loop through values of 'i' from 2 to 'n'
        for (int i = 2; i <= n; i++) {
            // Define the term in the summation for this iteration
            double term = Math.pow(c, n - i) * gn; // Example expression: c^(n-i) * g(n)
            result += term; // Add the term to the result
        }
        return result; // Return the summation result
    }

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            // Read input values for the series
            String[] s1Part = scanner.nextLine().split(" "); // Read input for S(1)
            String[] cPart = scanner.nextLine().split(" "); // Read input for 'c'
            String[] gnPart = scanner.nextLine().split(" "); // Read input for 'g(n)'

            // Parse the input values as doubles
            double s1 = Double.parseDouble(s1Part[1]);
            double c = Double.parseDouble(cPart[1]);
            double gn = Double.parseDouble(gnPart[1]);

            // Print the series formula using the input values
            System.out.println("S(n) = " + c + "^(n-1) * " + s1 + " + sigma(" + c + "^(n-i) * " + gn + ")");

            // Calculate and print the first 10 terms of the series
            for (int n = 1; n <= 10; n++) {
                double sn = Math.pow(c, n - 1) * s1 + sigma(c, gn, n); // Calculate S(n) using the formula
                System.out.println("S(" + n + ") = " + sn); // Print the result for S(n)
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
