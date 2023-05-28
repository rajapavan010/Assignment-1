import java.util.Arrays;
import java.util.Scanner;

public class Aqus5 {
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

        System.out.print("Enter the element to remove: ");
        int element = scanner.nextInt();

        scanner.close();

        int[] newArray = removeElement(arr, element);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("New Array: " + Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] arr, int element) {
        int count = 0;
        for (int num : arr) {
            if (num != element) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num != element) {
                newArray[index] = num;
                index++;
            }
        }

        return newArray;
    }
}
