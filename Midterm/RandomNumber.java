import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = scanner.nextInt();

        int randomNum = (int) (Math.random() * (n + 1));
        System.out.println("Random number (0 to " + n + "): " + randomNum);

        scanner.close();
    }
}
