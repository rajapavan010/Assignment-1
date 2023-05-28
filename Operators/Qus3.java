import java.util.Scanner;

public class Qus3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int value1 = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int value2 = scanner.nextInt();

        boolean isEqual = value1 == value2;
        boolean isNotEqual = value1 != value2;

        System.out.println("Equality Comparison:");
        System.out.println(value1 + " == " + value2 + ": " + isEqual);
        System.out.println(value1 + " != " + value2 + ": " + isNotEqual);

        scanner.close();
    }
}
