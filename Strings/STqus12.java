import java.util.Scanner;

public class STqus12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String numberString = String.valueOf(number);
        System.out.println("Number converted to string: " + numberString);

        scanner.close();
    }
}
