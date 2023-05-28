import java.util.*;

public class Aqus12 {
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

        scanner.close();

        int[] result = removeDuplicates(arr);

        System.out.println("Array with duplicates removed: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new LinkedHashSet<>();

        for (int num : arr) {
            uniqueElements.add(num);
        }

        int[] result = new int[uniqueElements.size()];
        int index = 0;

        for (int num : uniqueElements) {
            result[index++] = num;
        }

        return result;
    }
}
