import java.util.Scanner;

public class Aqus16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int difference = calculateDifference(array);
        System.out.println("Difference: " + difference);

        scanner.close();
    }

    public static int calculateDifference(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must have at least one element.");
        }

        int smallest = array[0];
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }

            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest - smallest;
    }
}
