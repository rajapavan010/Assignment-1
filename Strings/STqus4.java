import java.util.Scanner;

public class STqus4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the starting index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the ending index: ");
        int endIndex = scanner.nextInt();

        String substring = str.substring(startIndex, endIndex);

        System.out.println("Substring: " + substring);

        scanner.close();
    }
}
