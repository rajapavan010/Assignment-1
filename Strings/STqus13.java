import java.util.Scanner;

public class STqus13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        Integer integerObject = Integer.valueOf(number);
        String numberString = integerObject.toString();
        System.out.println("Integer converted to string: " + numberString);

        scanner.close();
    }
}
