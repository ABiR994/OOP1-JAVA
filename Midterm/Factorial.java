import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if(n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while(true) {
            System.out.print("Enter a non-negative integer: ");
            n = scanner.nextInt();

            if(n >= 0) {
                scanner.close();
                break;
            }
            System.out.println("\nInvalid input. Please enter a non-negative integer.\n");
        }

        System.out.println("\nFactorial of " + n + " is: " + factorial(n));
    }
}
