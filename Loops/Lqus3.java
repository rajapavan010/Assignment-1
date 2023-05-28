import java.util.Scanner;

public class Lqus3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num1 == num2) {
            System.out.println("num1 is equal to num2");
        } else {
            System.out.println("num1 is not equal to num2");
        }
        if (num1 != num2) {
            System.out.println("num1 is not equal to num2");
        } else {
            System.out.println("num1 is equal to num2");
        }

        scanner.close();
    }
}
