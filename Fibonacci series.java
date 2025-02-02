import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();

        // Calling the Fibonacci method
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        fibonacci(terms);

        scanner.close();
    }

    // Method to generate the Fibonacci series
    public static void fibonacci(int n) {
        long first = 0, second = 1;

        System.out.print(first + " " + second + " "); // Print first two terms
        
        for (int i = 3; i <= n; i++) {
            long nextTerm = first + second;
            System.out.print(nextTerm + " ");
            first = second;
            second = nextTerm;
        }

        System.out.println(); // New line after the series
    }
}


