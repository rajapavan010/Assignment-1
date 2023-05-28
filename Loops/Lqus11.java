import java.util.Scanner;

public class Lqus11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        switch (number % 2) {
            case 0:
                System.out.println(number + " is an even number.");
                break;
            case 1:
                System.out.println(number + " is an odd number.");
                break;
        }
    }
}
