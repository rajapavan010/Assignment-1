import java.util.Scanner;

public class Aqus4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to check: ");
        int value = scanner.nextInt();

        scanner.close();

        boolean containsValue = containsValue(arr, value);

        if (containsValue) {
            System.out.println("The array contains the value " + value);
        } else {
            System.out.println("The array does not contain the value " + value);
        }
    }

    public static boolean containsValue(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}
