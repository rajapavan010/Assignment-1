import java.util.Scanner;

public class Aqus19 {
    static int[] ar;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        ar = new int[n];

        System.out.println("Enter the elements in sorted order:");

        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        displayMissing();

        scanner.close();
    }

    static public void displayMissing() {

        System.out.print("Given array (already sorted): ");
        for (int j = 0; j < ar.length; j++)
            System.out.print(ar[j] + " ");

        System.out.print("\nNumbers missing between 1 to 100 in the array: ");

        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (j < ar.length && i == ar[j])
                j++;
            else
                System.out.print(i + " ");

        }

    }
}
