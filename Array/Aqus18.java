import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aqus18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] uniqueArray = removeDuplicates(array);
        System.out.println("New Array: " + Arrays.toString(uniqueArray));

        scanner.close();
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();

        for (int element : array) {
            uniqueElements.add(element);
        }

        int[] uniqueArray = new int[uniqueElements.size()];
        int index = 0;

        for (int element : uniqueElements) {
            uniqueArray[index++] = element;
        }

        return uniqueArray;
    }
}
