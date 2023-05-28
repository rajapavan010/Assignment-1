import java.util.Scanner;

public class STqus6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a regular expression: ");
        String regex = scanner.nextLine();

        System.out.print("Return Value: ");
        System.out.println(inputString.matches(regex));

        scanner.close();
    }
}
