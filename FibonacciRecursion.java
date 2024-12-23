import java.util.Scanner;

public class FibonacciRecursion {
    // Iterative method to calculate Fibonacci numbers
    public static void printFibonacci(int num) {
        if (num <= 0) {
            System.out.println("Invalid input. Number of terms must be greater than 0.");
            return;
        }
        
        int a = 0, b = 1;
        
        System.out.print("Fibonacci sequence: ");
        
        for (int i = 0; i < num; i++) {
            System.out.print(a + " "); // Print the current term
            int next = a + b; // Calculate the next term
            a = b; // Update a to the current term
            b = next; // Update b to the next term
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt(); // User input for the number of terms
        System.out.println("printing with iterative method");
        printFibonacci(num); // Call the method to print the sequence
        
        scanner.close();
    }
}
