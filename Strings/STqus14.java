import java.util.Scanner;

public class STqus14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String uppercaseString = inputString.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        String lowercaseString = inputString.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseString);

        scanner.close();
    }
}
