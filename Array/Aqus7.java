import java.util.Arrays;
import java.util.Scanner;

public class Aqus7 {
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

        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        System.out.print("Enter the position to insert the element: ");
        int position = scanner.nextInt();

        scanner.close();

        int[] newArray = insertElement(arr, element, position);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("New Array: " + Arrays.toString(newArray));
    }

    public static int[] insertElement(int[] arr, int element, int position) {
        int newSize = arr.length + 1;
        int[] newArray = new int[newSize];
        for (int i = 0; i < position; i++) {
            newArray[i] = arr[i];
        }
        newArray[position] = element;
        for (int i = position + 1; i < newSize; i++) {
            newArray[i] = arr[i - 1];
        }
        return newArray;
    }
}
