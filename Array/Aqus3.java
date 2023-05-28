import java.util.Scanner;

public class Aqus3 {
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

        System.out.print("Enter the element to find its index: ");
        int element = scanner.nextInt();

        scanner.close();

        int index = findElementIndex(arr, element);

        if (index != -1) {
            System.out.println("Index of " + element + " is " + index);
        } else {
            System.out.println(element + " is not found in the array.");
        }
    }

    public static int findElementIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
