import java.util.Scanner;

public class Qus7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println("Smaller number: " + num1);
            System.out.println("Larger number: " + num2);
        } else if (num1 > num2) {
            System.out.println("Smaller number: " + num2);
            System.out.println("Larger number: " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
