import java.util.Scanner;

public class STqus9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String trimmedString = inputString.trim();
        System.out.println("Trimmed string: " + trimmedString);

        scanner.close();
    }
}
