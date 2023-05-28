import java.util.Scanner;

public class STqus7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean isEqual = str1.equals(str2);
        System.out.println("str1.equals(str2): " + isEqual);

        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("str1.equalsIgnoreCase(str2): " + isEqualIgnoreCase);

        System.out.print("Enter a prefix to check with str1: ");
        String prefix = scanner.nextLine();
        boolean startsWithPrefix = str1.startsWith(prefix);
        System.out.println("str1.startsWith(prefix): " + startsWithPrefix);

        System.out.print("Enter a suffix to check with str1: ");
        String suffix = scanner.nextLine();
        boolean endsWithSuffix = str1.endsWith(suffix);
        System.out.println("str1.endsWith(suffix): " + endsWithSuffix);

        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult < 0) {
            System.out.println("str1 comes before str2");
        } else if (comparisonResult > 0) {
            System.out.println("str1 comes after str2");
        } else {
            System.out.println("str1 and str2 are equal");
        }

        scanner.close();
    }
}
