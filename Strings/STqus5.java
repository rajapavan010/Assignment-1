import java.util.Scanner;

public class STqus5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the substring to search: ");
        String substring = scanner.nextLine();

        int index = str.indexOf(substring);

        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found");
        }

        scanner.close();
    }
}
