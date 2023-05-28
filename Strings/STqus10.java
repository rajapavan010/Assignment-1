import java.util.Scanner;

public class STqus10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.nextLine().charAt(0);

        System.out.print("Enter the replacement character: ");
        char newChar = scanner.nextLine().charAt(0);

        String replacedString = inputString.replace(oldChar, newChar);
        System.out.println("Replaced string: " + replacedString);

        scanner.close();
    }
}
