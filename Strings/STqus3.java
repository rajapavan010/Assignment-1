import java.util.Scanner;

public class STqus3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int length = str.length();

        System.out.println("Length of the string: " + length);

        scanner.close();
    }
}
