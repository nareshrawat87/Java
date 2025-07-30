import java.util.*;

public class primeornot {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) { // Optimization: check till sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input range
        System.out.print("Enter the starting number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter the ending number (y): ");
        int y = sc.nextInt();

        // Print and count primes
        int count = 0;
        System.out.println("Prime numbers between " + x + " and " + y + " are:");
        for (int i = x; i <= y; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal prime numbers: " + count);
    }
}
