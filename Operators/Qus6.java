import java.util.Scanner;

public class Qus6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is not less than b");
        }
        if (a <= b) {
            System.out.println("a is less than or equal to b");
        } else {
            System.out.println("a is not less than or equal to b");
        }
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }
        if (a >= b) {
            System.out.println("a is greater than or equal to b");
        } else {
            System.out.println("a is not greater than or equal to b");
        }
    }
}
