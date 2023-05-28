import java.util.Scanner;

public class STqus11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the delimiter: ");
        String delimiter = scanner.nextLine();

        String[] splitArray = inputString.split(delimiter);

        System.out.println("Split elements:");
        for (String element : splitArray) {
            System.out.println(element);
        }

        scanner.close();
    }
}
