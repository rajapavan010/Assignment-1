import java.util.Scanner;

public class STqus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String concatenatedString = str1 + str2;

        System.out.println("Concatenated string: " + concatenatedString);

        scanner.close();
    }
}
